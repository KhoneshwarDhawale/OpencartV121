package pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement inpEnterSearch;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	@FindBy(xpath="//a[normalize-space()='Qafox.com']")
	WebElement lnkHPageLogo;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li/child::a")
	List<WebElement> listNavBarItem;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement lnkShoppingCart;
	
	@FindBy(xpath="//li[@class='dropdown open']//li//a")
	List<WebElement> listMyaccountsdrpDwn;
	
	@FindBy(xpath="//h3[normalize-space()='Featured']")
	WebElement txtFeaturedProduct;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement lnkContactus;
	
	@FindBy(xpath="//a[text()='Gift Certificates']")
	WebElement lnkGiftCertificates;
	
	@FindBy(xpath="//a[text()='Specials']")
	WebElement lnkSpecialOffers;
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}
	public void EnterSearch(String search)
	{
		inpEnterSearch.sendKeys(search);
	}
	public void clearSearch()
	{
		inpEnterSearch.clear();
	}
	public void clickSearch()
	{
		btnSearch.click();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public boolean isLogoPresent()
	{
		try {
			return lnkHPageLogo.isDisplayed();
		} catch(Exception e) {
			return false;
		}
	}
	public List<String> listOfNavBarItems()
	{
		List<WebElement> items = listNavBarItem;
		List<String> textItemList = items.stream().map(WebElement::getText).collect(Collectors.toList());
		return textItemList;
	}
	public void clickShoppingCart()
	{
		lnkShoppingCart.click();
	}
	public List<String> myAccountDrpDwn()
	{
		List<WebElement> items = listMyaccountsdrpDwn;
		List<String> textItemList = items.stream().map(WebElement::getText).collect(Collectors.toList());
		return textItemList;
	}
	public boolean isFeaturedProductDisplayed()
	{
		return txtFeaturedProduct.isDisplayed();
	}
	public void clickContactus()
	{
		lnkContactus.click();
	}
	public void clickGiftCertificates()
	{
		lnkGiftCertificates.click();
	}
	public void clickSpecialOffers()
	{
		lnkSpecialOffers.click();
	}
}
