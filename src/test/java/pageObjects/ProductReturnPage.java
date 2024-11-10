package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnPage extends Basepage{

	public ProductReturnPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Product Returns']")
	WebElement txtProductReturn;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public boolean isProductReturnExist()
	{
		try {
			return txtProductReturn.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
