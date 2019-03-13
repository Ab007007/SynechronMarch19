package com.synechron.training.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.synechron.training.utils.DriverUtils;

public class CounterAppFluentWaitDemo
{
	public static void main(String[] args)
	{
		// file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/CounterText.html
		WebDriver driver = DriverUtils.getMyDriver();

		driver.get("file:///D:/Synechron/06_MAR_JAVA/SeleniumTraining/html/CounterText.html");


		FluentWait<WebElement> wait  = new FluentWait<WebElement>(driver.findElement(By.id("counter")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(Exception.class);
		
		
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>()
		{

			@Override
			public Boolean apply(WebElement t)
			{
				if(t.getText().equals("3"))
				{
					System.out.println("TextFound");
					return true;
				}
				else
				{
					System.out.println("Waiting!!!!!!!" + t.getText());
					return false;
				}
			}
			
		};
		
		wait.until(fun);
	}
}
