package com.synechron.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.synechron.training.utils.DriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2
{

	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement lougoutLink = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		
		lougoutLink.click();

		
	}
}
