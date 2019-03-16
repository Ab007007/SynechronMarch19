package test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.DashBoardPage;
import page.LoginPage;

public class LoginTest {

	WebDriver driver = null;
	LoginPage loginPage =null;
	DashBoardPage dashboardPage = null;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		loginPage = new LoginPage(driver);
		dashboardPage = new DashBoardPage(driver);
		
	}
	
	@Test
	public void loginWithValidCredsTest()
	{
		driver.get("http://localhost:8080");
		loginPage.loginToApp("admin", "manager");
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		dashboardPage.logout();
	}
	
	@Test
	public void loginWithInValidCredsTest()
	{
		driver.get("http://localhost:8080");
		loginPage.loginToApp("admin1", "manager1");
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	@AfterMethod
	public void checkExecutionStatus(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			try
			{
				FileUtils.copyFile(source, new File("ss\\ScreenShot" + new Date().toString().replaceAll(" ", "_").replaceAll(":", "_") + ".png"));
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
	}
	

}
