package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Basepage{

	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")
	WebElement txtShoppingCart;
	
	@FindBy(xpath="//div[@class='table-responsive']//table[@class='table table-bordered']//td[2]//a")
	WebElement txtProductName;
	
	@FindBy(xpath="//div[@class='input-group btn-block']//input")
	WebElement txtProductQuanity;
	
	public boolean isShoppingCartPageExist()
	{
		try
		{
			return txtShoppingCart.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String getProductName()
	{
		return txtProductName.getText();
	}
	
	public int getProductQuantity()
	{
		int value = Integer.parseInt(txtProductQuanity.getAttribute("value"));
		return value;
	}
}
