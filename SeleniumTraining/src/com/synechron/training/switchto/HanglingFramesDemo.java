package com.synechron.training.switchto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class HanglingFramesDemo
{

	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://jqueryui.com/droppable/");
		
		WebElement frameElement = ActitimeUtils.getMyElement("xpath", "//iframe[contains(@src,'droppable')]");
		driver.switchTo().frame(frameElement);
		
		WebElement sourceEle = DriverUtils.getMyElement("id", "draggable");
		WebElement destinationEle = DriverUtils.getMyElement("id", "droppable");
		
		System.out.println("Text before drag and drop " + destinationEle.getText());
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceEle, destinationEle).perform();
		
		System.out.println("Text after drag and drop " + destinationEle.getText());
		
		driver.switchTo().defaultContent();
		ActitimeUtils.clickOnElement("xpath","//a[text()='Draggable']");
		System.out.println("end");
		
		
	}
}
