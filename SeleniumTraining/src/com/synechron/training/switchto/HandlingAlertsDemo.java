package com.synechron.training.switchto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class HandlingAlertsDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverUtils.getMyDriver("ff");
		ActitimeUtils.launch("http://localhost:8080");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnModule("TASKS");
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.typeText("id", "customerLightBox_nameField", "DummyText");
		ActitimeUtils.clickOnElement("xpath", "//div[text()='Cancel']");
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		System.out.println("Alert handled");
		Thread.sleep(2000);
		ActitimeUtils.clickOnElement("xpath", "//td[@class='buttonsBox']//div[text()='Cancel']");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		ActitimeUtils.logout();
	}
}
