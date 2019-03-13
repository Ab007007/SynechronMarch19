package com.synechron.training.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils
{
	static WebDriver driver = null;

	public static WebDriver getMyDriver()
	{
		System.out.println("Driver Creation Called....");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void launch(String url)
	{
		System.out.println("Launching the application " + url);
		driver.get(url);
	}
	
	public static boolean validateElementExistAndEnabled(WebElement ele)
	{
		boolean flag = false;
		
		if(ele.isDisplayed())
		{
			System.out.println("Element is displayed");
			if(ele.isEnabled())
			{
				System.out.println("Element is enabled ");
				flag=true;
			}
			else
			{
				System.out.println("Element is not enabled...");
			}
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		
		return flag;
	}
	
	public static WebElement getMyElement(String locator,String locatorValue)
	{
		System.out.println("Finding elements using " + locator + " and " + locatorValue);
		WebElement ele = null;
		
		switch (locator)
		{
		case "id":
			ele = driver.findElement(By.id(locatorValue));
			break;

		case "name":
			ele = driver.findElement(By.name(locatorValue));
			break;

		case "classname":
			ele = driver.findElement(By.className(locatorValue));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(locatorValue));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(locatorValue));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(locatorValue));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(locatorValue));
			break;

		case "xpath":
			ele = driver.findElement(By.xpath(locatorValue));
			break;

		default:
			System.out.println("Please pass valid identifier..");
			break;
		}
		if(validateElementExistAndEnabled(ele))
		{
			System.out.println("element is capable of taking action....");
		}
		return ele;
		
	}
	
	
	public static void typeText(String locator, String locatorValue,String textTotype)
	{
		System.out.println("typing on and element using " + locator + " locator value " + locatorValue + " and " + textTotype);
		getMyElement(locator, locatorValue).sendKeys(textTotype);
	}
	
	
	public static void clickOnElement(String locator, String locatorValue)
	{
		System.out.println("clicking on an ele " + locator + " and " + locatorValue);
		getMyElement(locator, locatorValue).click();
	}
	
	
	public static void clickOnElement(WebElement ele)
	{
		ele.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
