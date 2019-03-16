package com.synechron.training.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils
{
	public static WebDriver driver = null;

	public static void executeAutoITScript(String browser)
	{
		switch(browser)
		{
		case "chrome" :
			try
			{
				Runtime.getRuntime().exec("autoitScripts\\ChromeAuthHandler.exe");
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "ie" :
			try
			{
				Runtime.getRuntime().exec("autoitScripts\\IEwindowsAuthHandler.exe");
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default : 
			System.out.println("contact Framework development team");
		}
	}
	public static WebDriver getMyDriver()
	{
		System.out.println("Driver Creation Called....");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver getMyRemoteDriver(String nodeUrl)
	{
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("disable-infobars");
		try
		{
			driver = new RemoteWebDriver(new URL(nodeUrl),options);
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	/**
	 * 
	 * @param type -> ff,chrome,ie
	 * @return
	 */
	public static WebDriver getMyDriver(String type)
	{
		System.out.println("Creating a Driver with " + type);
		switch (type)
		{
		case "ff":
			 	WebDriverManager.firefoxdriver().setup();
			 	driver = new FirefoxDriver();
			break;
		case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			break;
		case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please contact Framework Development team to suppport " + type);
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
