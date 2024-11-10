package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends Basepage{

	public ForgotPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inpEmail;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement lnkContinue;
	
	@FindBy(xpath="//a[normalize-space()='Back']")
	WebElement lnkBack;
	
	public void EnterEmail(String email)
	{
		inpEmail.sendKeys(email);
	}
	
	public void clickContinue()
	{
		lnkContinue.click();
	}
	
	public void clickBack()
	{
		lnkBack.click();
	}
}
