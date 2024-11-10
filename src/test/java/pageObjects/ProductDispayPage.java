package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDispayPage extends Basepage{

	public ProductDispayPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']//h1")
	WebElement txtSearch;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement inpSearch;
	
	@FindBy(xpath="//a[normalize-space()='MacBook']")
	WebElement txtMacbook;
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]")
	WebElement btnCmpMacbook;
	
	@FindBy(xpath="//a[normalize-space()='MacBook Air']")
	WebElement txtMacbookAir;
	
	@FindBy(xpath="//div[@id='content']//div[2]//div[1]//div[2]//div[2]//button[3]")
	WebElement btnCmpMacbookAir;
	
	@FindBy(xpath="//a[@id='compare-total']")
	WebElement btnCompare;
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement txtShoppingCartAlert;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement lnkShoppingCart;
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
	WebElement btnAddToWishList;
	
	@FindBy(xpath="//span[normalize-space()='Wish List (0)']")
	WebElement lnkWishList;
	
	public String getSearchText()
	{
		String result = txtSearch.getText();
		String ExpString = result.substring(9);
		return ExpString;
	}
	public void clearSearch()
	{
		inpSearch.clear();
	}
	public String getTextMacbook()
	{
		return txtMacbook.getText();
	}
	public void clickCmpMacbook()
	{
		btnCmpMacbook.click();
	}
	public String getTextMacbookAir()
	{
		return txtMacbookAir.getText();
	}
	public void clickCmpMacbookAir()
	{
		btnCmpMacbookAir.click();
	}
	public void clickProductCompare()
	{
		btnCompare.click();
	}
	public void clickAddToCart()
	{
		btnAddToCart.click();
	}
	public boolean isAddedToCartAlertPresent()
	{
		try
		{
			return txtShoppingCartAlert.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clickShoppingCart()
	{
		lnkShoppingCart.click();
	}
	public void addToWishList()
	{
		btnAddToWishList.click();
	}
	public void clickWishList()
	{
		lnkWishList.click();
	}
}
