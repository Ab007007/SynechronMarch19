package com.synechron.training.tests;

import org.openqa.selenium.WebDriver;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class CreateCustomerTestUsingFunctions
{

	public static void main(String[] args)
	{
		WebDriver driver = DriverUtils.getMyDriver();

		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnModule("TASKS");
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.createCustomer("syn-Mar-33", "syn-Mar-3-Desc");
		ActitimeUtils.logout();		
//		driver.findElement(By.className("")).is
	}
}
