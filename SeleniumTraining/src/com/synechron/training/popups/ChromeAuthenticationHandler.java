package com.synechron.training.popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class ChromeAuthenticationHandler
{
	public static void main(String[] args) throws IOException
	{
		String browsertype = "ie";
		DriverUtils.executeAutoITScript(browsertype);
		WebDriver driver = DriverUtils.getMyDriver(browsertype);
		
		ActitimeUtils.launch("https://www.engprod-charter.net/");
	}

	
}
