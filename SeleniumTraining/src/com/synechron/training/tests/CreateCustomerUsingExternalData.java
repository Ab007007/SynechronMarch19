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

public class CreateCustomerUsingExternalData
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = DriverUtils.getMyDriver(ConfigReader.getMyPropertyValue("browser"));

		ActitimeUtils.launch(ConfigReader.getMyPropertyValue("url"));
		String un = ConfigReader.getMyPropertyValue("username");
		String pwd = ConfigReader.getMyPropertyValue("password");
		
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnModule("TASKS");
		File file = new File("data//customerdata.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br =  new BufferedReader(fr);
		String line=null;
		while((line=br.readLine())!=null)
		{
			String[] data = line.split(",");
			ActitimeUtils.clickOnCreateCustomerButton();
			ActitimeUtils.createCustomer(data[0],data[1]);
		}
		fr.close();
		ActitimeUtils.logout();		
//		driver.findElement(By.className("")).is
	}
}









