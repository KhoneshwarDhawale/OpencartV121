package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutPage extends Basepage{
	
	public AccountLogoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='Account Logout']")
	WebElement txtLogout;
	
	public boolean isTxtLogoutExist()
	{
		try {
			return (txtLogout.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
