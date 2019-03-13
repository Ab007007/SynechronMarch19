package com.synechron.training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.utils.DriverUtils;

public class LoginTest
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = DriverUtils.getMyDriver();
		
		DriverUtils.launch("http://localhost:8080");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement lougoutLink = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		
		lougoutLink.click();
	}

}
