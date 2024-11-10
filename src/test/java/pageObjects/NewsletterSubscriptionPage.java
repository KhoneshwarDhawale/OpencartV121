package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterSubscriptionPage extends Basepage{

	public NewsletterSubscriptionPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Newsletter Subscription']")
	WebElement txtNewsletterSubscription;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement rdYes;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public boolean isNewsletterSubscriptionPageExist()
	{
		try {
			return txtNewsletterSubscription.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickYesSubscribe()
	{
		rdYes.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
