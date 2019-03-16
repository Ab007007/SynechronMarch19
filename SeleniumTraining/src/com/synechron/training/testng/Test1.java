package com.synechron.training.testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.synechron.training.utils.DriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
	WebDriver driver =null;
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("http://localhost:8080");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement lougoutLink = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));

		lougoutLink.click();

		
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
