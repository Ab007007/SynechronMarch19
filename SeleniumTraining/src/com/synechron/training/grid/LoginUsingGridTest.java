package com.synechron.training.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.utils.DriverUtils;

public class LoginUsingGridTest
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		String nodeUrl = "http://192.168.1.101:5555/wd/hub";
		
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		options.addArguments("disable-infobars");
//		WebDriver driver = new RemoteWebDriver(new URL(nodeUrl),options);
//		
		
		WebDriver driver = DriverUtils.getMyRemoteDriver(nodeUrl);
		driver.get("http://localhost:8080");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement lougoutLink = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		
		lougoutLink.click();

	}
}
