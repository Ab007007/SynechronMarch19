package com.synechron.training.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutionDemo
{

	WebDriver driver = null;
	@Test
	public void jsExecutionTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/scroll");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 900);");
		js.executeAsyncScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		
		
		
	}
}
