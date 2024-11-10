package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountInfoPage extends Basepage{

	public MyAccountInfoPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='My Account Information']")
	WebElement  txtMyAccountInfo;
	
	public boolean isMyAccountInfoShowing()
	{
		try {
		return txtMyAccountInfo.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
}
