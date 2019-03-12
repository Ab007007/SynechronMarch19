package com.synechron.training.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://formy-project.herokuapp.com");
		
		driver.findElement(By.xpath("//li/a[text()='Complete Web Form']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("HB");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("4");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("5-9");
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
