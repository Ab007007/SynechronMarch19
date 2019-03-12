package com.synechron.training.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.utils.DriverUtils;

public class WebDriverWaitDemo
{
	public static void main(String[] args)
	{
		WebDriver driver =  DriverUtils.getMyDriver();
		
		driver.get("file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button")).click();
		
		//String helloText = driver.findElement(By.id("demo")).getText();
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String helloText = driver.findElement(By.id("demo")).getText();
		String helloRedText = driver.findElement(By.id("demo2")).getText();
		System.out.println("Text displayed is " + helloText);
		System.out.println("Text displayed is " + helloRedText);
	}

}
