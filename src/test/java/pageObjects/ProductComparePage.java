package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends Basepage{
	
	public ProductComparePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Product Comparison']")
	WebElement txtProductCompare;
	
	@FindBy(xpath="//strong[normalize-space()='MacBook']")
	WebElement txtMacbook;
	
	@FindBy(xpath="//strong[normalize-space()='MacBook Air']")
	WebElement txtMacBookAir;
	
	public boolean isProductCmpVisisble()
	{
		try
		{
			return txtProductCompare.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String getMacbookText()
	{
		return txtMacbook.getText();
	}
	
	public String getMacbookAirText()
	{
		return txtMacBookAir.getText();
	}
}
