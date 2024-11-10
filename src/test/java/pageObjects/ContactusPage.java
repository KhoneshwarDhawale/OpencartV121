package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends Basepage{

	public ContactusPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()='Contact Us']")
	WebElement txtContactUs;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement inpName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inpEmail;
	
	@FindBy(xpath="//textarea[@id='input-enquiry']")
	WebElement inpEnquiry;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement btnSubmit;
	
	public boolean isContactusPageExist()
	{
		try{
			return txtContactUs.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	public void enterName(String name)
	{
		inpName.sendKeys(name);
	}
	public void enterEmail(String email)
	{
		inpEmail.sendKeys(email);
	}
	public void enterEnquiry(String enquiry)
	{
		inpEnquiry.sendKeys(enquiry);
	}
	public void clickSubmit()
	{
		inpName.click();
	}
}
