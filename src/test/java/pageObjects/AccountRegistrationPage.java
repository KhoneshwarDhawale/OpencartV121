package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends Basepage {

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath = "//h1[normalize-space()='Register Account']")
	WebElement txtRegisterAccount;
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setTelephone(String phone)
	{
		txtTelephone.sendKeys(phone);
	}
	public void setPassword(String pswd)
	{
		txtPassword.sendKeys(pswd);
	}
	public void setConfirmPassword(String cpswd)
	{
		txtConfirmPassword.sendKeys(cpswd);
	}
	public void setPrivacyPolicy()
	{
		chkPolicy.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public String getConfirmationMsg()
	{
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}	
	public boolean isRegistrationPageExist()
	{
		return txtRegisterAccount.isDisplayed();
	}
}
