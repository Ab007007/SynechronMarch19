package com.synechron.training.popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class IEAuthenticationHandler
{
	public static void main(String[] args) throws IOException
	{
		Runtime.getRuntime().exec("autoitScripts\\IEwindowsAuthHandler.exe");
		
		WebDriver driver = DriverUtils.getMyDriver("ie");
		
		ActitimeUtils.launch("https://www.engprod-charter.net/");
	}

}
