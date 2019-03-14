package com.synechron.training.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.crypto.spec.DHGenParameterSpec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class HandlingChildBrowserDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		List<WebElement> hyperlinksOfParent = driver.findElements(By.xpath("//a"));
		printCollections(hyperlinksOfParent);
		ActitimeUtils.clickOnElement("linktext","Contact Us");
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		String parentID = it.next();
		String childId = it.next();
		System.out.println(parentID);
		System.out.println(childId);
		driver.switchTo().window(childId);
		System.out.println("Child browser links"); 
		List<WebElement> hyperlinksOfChild = driver.findElements(By.xpath("//a"));
		printCollections(hyperlinksOfChild);
		driver.close();
		driver.switchTo().window(parentID);
		driver.close();
	}

	private static void printCollections(List<WebElement> hyperlinksOfChild)
	{
		System.out.println("***************************************************");
		for (WebElement webElement : hyperlinksOfChild)
		{
			System.out.println(webElement.getText());
		}
		System.out.println("***************************************************");
		
	}

}
