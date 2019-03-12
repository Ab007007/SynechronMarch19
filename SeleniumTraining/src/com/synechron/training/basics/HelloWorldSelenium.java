package com.synechron.training.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWorldSelenium
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://formy-project.herokuapp.com");
		
		/*WebElement completeFormLink = driver.findElement(By.xpath("//li/a[text()='Complete Web Form']"));
		
		completeFormLink.click();
		*/
	//	driver.close();
		
				
	}

}
