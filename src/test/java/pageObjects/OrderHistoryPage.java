package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends Basepage{

	public OrderHistoryPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Order History']")
	WebElement txtOrderPage;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public boolean isOrderPageExist()
	{
		try {
			return txtOrderPage.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
