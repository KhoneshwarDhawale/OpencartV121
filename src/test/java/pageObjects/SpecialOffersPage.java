package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialOffersPage extends Basepage{

	public SpecialOffersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='Special Offers']")
	WebElement txtSpecialOffers;
	
	public boolean isSpecialOfferPageExist()
	{
		try {
			return txtSpecialOffers.isDisplayed();
		} catch(Exception e) {
			return false;
		}
	}
}
