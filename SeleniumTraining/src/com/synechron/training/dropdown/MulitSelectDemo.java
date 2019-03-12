package com.synechron.training.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulitSelectDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		//file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/multiSelect.html
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/multiSelect.html");
		
		Select sel =  new Select(driver.findElement(By.xpath("//select")));
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		sel.selectByValue("audi");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		
		sel.deselectByValue("audi");
		Thread.sleep(2000);
		
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
	
		sel.selectByIndex(1);
		
		sel.selectByValue("audi");
		
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);

		sel.deselectAll();
	
	
	}

}
