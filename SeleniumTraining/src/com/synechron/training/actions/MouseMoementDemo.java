package com.synechron.training.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class MouseMoementDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement closeButton = wait.until(ExpectedConditions.
				visibilityOf(DriverUtils.getMyElement("xpath", "//button[@class='_2AkmmA _29YdH8']")));
		
		closeButton.click();
		WebElement eleElectronics =  DriverUtils.getMyElement("xpath", "//span[text()='Electronics']");
		WebElement eleMen =  DriverUtils.getMyElement("xpath", "//span[text()='Men']");
		WebElement eleWomen =  DriverUtils.getMyElement("xpath", "//span[text()='Women']");
				
		Actions act = new Actions(driver);
		
		act.moveToElement(eleElectronics).perform();
		Thread.sleep(3000);

		act.moveToElement(eleMen).perform();
		Thread.sleep(3000);
		
		act.moveToElement(eleWomen).perform();
				
//		act.moveToElement(driver.findElement(By.id(""))).perform();
	}
}
