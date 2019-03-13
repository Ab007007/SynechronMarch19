package com.synechron.training.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class DragAndDropDemo
{

	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement sourceEle = DriverUtils.getMyElement("id", "draggable");
		WebElement destinationEle = DriverUtils.getMyElement("id", "droppable");
		
		System.out.println("Text before drag and drop " + destinationEle.getText());
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceEle, destinationEle).perform();
		
		System.out.println("Text after drag and drop " + destinationEle.getText());
		
		System.out.println("end");
		
		
	}
}
