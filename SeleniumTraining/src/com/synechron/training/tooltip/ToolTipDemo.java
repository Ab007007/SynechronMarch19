package com.synechron.training.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.training.utils.DriverUtils;

public class ToolTipDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("https://www.google.com/");
		
		WebElement googleImg = driver.findElement(By.xpath("//img[@data-atf='1']"));
		
		if(googleImg.getAttribute("alt").equals("30th Anniversary of the World Wide Web"))
		{
			System.out.println("Tool Tip displayed....!!!!!" + googleImg.getAttribute("alt"));
		}
		else
		{
			System.out.println("Tool tip not Displayed");
		}
		
		
		WebElement appsIcon = driver.findElement(By.xpath("//a[@class='gb_x gb_Vb']"));
		
		System.out.println(appsIcon.getAttribute("title"));
		
		
		
		String text = driver.findElement(By.xpath("//a[@rel='nofollow']")).getText();
		
		System.out.println(text);
	}

}
