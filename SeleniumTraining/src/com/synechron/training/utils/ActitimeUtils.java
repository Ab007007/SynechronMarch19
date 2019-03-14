package com.synechron.training.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{

	public static void login(String un, String pwd) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void clickOnModule(String moduleName)
	{
		System.out.println("Clicking on a module --" + moduleName);
		//driver.findElement(By.xpath("//a[div[text()='" + moduleName + "']]")).click();
		clickOnElement("xpath", "//a[div[text()='" + moduleName + "']]");
		
	}
	
	public static void clickOnCreateCustomerButton()
	{
		System.out.println("clicking on Add New Button ");
		//driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		System.out.println("Clicking on New Customer Button");
		//driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
		clickOnElement("xpath", "//div[contains(text(),'New Customer')]");
	}
	
	public static void createCustomer(String cn , String cd)
	{
		System.out.println("Creating a customer with " +cn + " and " + cd);
		//driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
//		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
//		driver.findElement(By.id("customerLightBox_commitBtn")).click();

		typeText("id", "customerLightBox_nameField", cn);
		typeText("id", "customerLightBox_descriptionField", cd);
		clickOnElement("id", "customerLightBox_commitBtn");
		
		WebDriverWait waitVisible = new WebDriverWait(driver, 20);
		WebElement successMessage = waitVisible.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success message displayed...." + successMessage.getText());

		WebDriverWait waitInvisible = new WebDriverWait(driver, 20);
		waitInvisible.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		System.out.println("Success message disappeared...");
		
		
	}
	
	public static void logout()
	{
		System.out.println("Logging out of application ");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement lougoutLink = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		lougoutLink.click();
		driver.close();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
