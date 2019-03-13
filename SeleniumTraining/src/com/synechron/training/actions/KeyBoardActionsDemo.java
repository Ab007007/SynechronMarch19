package com.synechron.training.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class KeyBoardActionsDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();

		ActitimeUtils.launch("http://localhost:8080/login.do");
		
		Actions act  = new Actions(driver);
				
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("manager").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		//act.sendKeys(Keys.ALT,Keys.CONTROL,Keys.DELETE).perform();
		
	}
	
}
