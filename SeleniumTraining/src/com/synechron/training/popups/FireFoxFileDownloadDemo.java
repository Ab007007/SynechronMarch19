package com.synechron.training.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.synechron.training.utils.ActitimeUtils;
import com.synechron.training.utils.DriverUtils;

public class FireFoxFileDownloadDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\Synechron\\06_MAR_JAVA\\SeleniumTraining\\autodownload\\");
				
		FirefoxOptions fo = new FirefoxOptions();
		fo.setProfile(fp);
		
		WebDriver driver = new FirefoxDriver(fo);
		DriverUtils.driver = driver;
		DriverUtils.launch("https://www.seleniumhq.org/download/");
		ActitimeUtils.clickOnElement("xpath", "//tr[td[text()='Java']]//a[text()='Download']");
		
		
	}
}
