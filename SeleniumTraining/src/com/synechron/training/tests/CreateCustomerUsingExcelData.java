package com.synechron.training.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.ConfigReader;
import com.synechron.training.utils.DriverUtils;
import com.synechron.training.utils.ExcelUtils;

public class CreateCustomerUsingExcelData
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = DriverUtils.getMyDriver(ConfigReader.getMyPropertyValue("browser"));

		ActitimeUtils.launch(ConfigReader.getMyPropertyValue("url"));
		String un = ConfigReader.getMyPropertyValue("username");
		String pwd = ConfigReader.getMyPropertyValue("password");
		
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnModule("TASKS");
		for(int i=1;i<ExcelUtils.getRowCount("customerdata");i++)
		{
			String cn = ExcelUtils.getMyCellValue("customerdata", i, 0);
			String cd = ExcelUtils.getMyCellValue("customerdata", i, 1);
			
			ActitimeUtils.clickOnCreateCustomerButton();
			ActitimeUtils.createCustomer(cn,cd);
		
		}
		ActitimeUtils.logout();		
//		driver.findElement(By.className("")).is
	}
}









