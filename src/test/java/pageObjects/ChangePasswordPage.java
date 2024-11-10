package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends Basepage{

	public ChangePasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Change Password']")
	WebElement  txtChangePassword;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement  inpPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement  inpConfirmPassword;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement  btnContinue;
	
	public void setPassword(String pass)
	{
		inpPassword.sendKeys(pass);
	}
	public void setConfirmPassword(String cPass)
	{
		inpConfirmPassword.sendKeys(cPass);
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public boolean isChangePasswordPageExist()
	{
		try {
		return txtChangePassword.isDisplayed();
		} catch(Exception e) {
			return false;
		}
	}
}
