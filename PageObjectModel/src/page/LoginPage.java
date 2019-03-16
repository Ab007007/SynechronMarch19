package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	WebElement userNameTxtBox;
	
	@FindBy(name="pwd")
	WebElement pwdTxtBox;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	
//	@CacheLookup
	
	
	public void loginToApp(String un,String pwd)
	{
		System.out.println("Login Function called..");
		userNameTxtBox.sendKeys(un);
		pwdTxtBox.sendKeys(pwd);
		loginButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
