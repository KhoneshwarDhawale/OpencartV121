package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement lnkForgotPassword;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertCheck;
	
	@FindBy(xpath="//h2[normalize-space()='Returning Customer']")
	WebElement txtReturningCustomer;
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pswd)
	{
		txtPassword.sendKeys(pswd);
	}
	public void clickLogin()
	{
		btnLogin.click();
	}
	public void clickForgotPassword()
	{
		lnkForgotPassword.click();
	}
	public boolean isAlertVisible()
	{
		try
		{
			return (alertCheck.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean isLoginPageExist()
	{
		return txtReturningCustomer.isDisplayed();
	}
	
}
