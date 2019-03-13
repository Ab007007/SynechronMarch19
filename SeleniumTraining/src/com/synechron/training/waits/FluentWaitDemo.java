package com.synechron.training.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.synechron.training.utils.DriverUtils;

public class FluentWaitDemo
{
	public static void main(String[] args)
	{
		WebDriver driver =  DriverUtils.getMyDriver();
		
		driver.get("file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button")).click();
			
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>()
		{

			@Override
			public Boolean apply(WebElement ele)
			{
				if(!(ele.getText().equals("Hello")))
				{
					System.out.println("Waiting for the text to become helloo");
					return false;
				}
				else
				{
					System.out.println("Hurryyyyy TEXT Found");
					return true;
				}
			}
		};
		
		wait.until(fun);
		
	}

}
















