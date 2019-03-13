package com.synechron.training.validations;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class ValidationdDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		String expectedTitle="Formy";
		if(expectedTitle.equals(driver.getTitle()))
		{
			System.out.println("Application loaded successfully..!!!!");
		}
		else
		{
			System.out.println("Application is not loaded...????");
		}
		
		
		System.out.println(driver.findElement(By.id("first-name")).isDisplayed());
		System.out.println(driver.findElement(By.id("first-name")).isEnabled());
		System.out.println(driver.findElement(By.id("first-name")).isSelected());
		
		WebElement checkbox = driver.findElement(By.id("checkbox-1"));
		checkbox.click();
		
		if(!(checkbox.isSelected()))
		{
			System.out.println("check box is not selected...clicking on checkbox");
			checkbox.click();
		}
		else
		{
			System.out.println("Checkbox is selected ...not selecting it");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
