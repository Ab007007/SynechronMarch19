package com.synechron.training.testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.ConfigReader;
import com.synechron.training.utils.DriverUtils;

public class CreateCustomerUsingDP
{
	WebDriver driver = null;
	
	@Parameters({"browser" , "url"})
	@BeforeTest
	public void launchApp(String browser,String url)
	{
		driver = DriverUtils.getMyDriver(browser);
		ActitimeUtils.launch(url);
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	@Parameters({"username" , "password"})
	@Test
	public void loginWithValiedCredsTest(String un,String pwd)
	{
		ActitimeUtils.login(un,pwd);
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		ActitimeUtils.logout();
	}
	
	@Parameters({"username" , "password"})
	@Test
	public void createCustomerPreCond(String un,String pwd)
	{
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnModule("TASKS");
	}
	
	@Test(dependsOnMethods= "createCustomerPreCond",dataProviderClass=TestData.class,dataProvider="customerdata")
	public void createCustomerTest(String cn,String cd)
	{
		
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.createCustomer(cn,cd);
		
	
	}
	
	@Test(dependsOnMethods="createCustomerTest")
	public void createCustomerPostCon()
	{
		ActitimeUtils.logout();
	}
	
}









