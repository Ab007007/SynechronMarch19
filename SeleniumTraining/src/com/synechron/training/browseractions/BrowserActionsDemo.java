package com.synechron.training.browseractions;

import org.openqa.selenium.WebDriver;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class BrowserActionsDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		Thread.sleep(2000);
		System.out.println("clicking on back button");
		driver.navigate().back();
		
		Thread.sleep(2000);
		System.out.println("clicking of forward button ");
		driver.navigate().forward();
		
		Thread.sleep(2000);
		System.out.println("refresh browser");
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		System.out.println("Navigate method...");
		driver.navigate().to("http://www.google.com");
		System.out.println("getting URL at Rutime");
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		System.out.println("Maximizing Browser");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("close the browser");
		driver.close();
//		driver.quit();

	}

}
