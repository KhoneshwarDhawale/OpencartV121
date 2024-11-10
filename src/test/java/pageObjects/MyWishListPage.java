package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishListPage extends Basepage{

	public MyWishListPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Wish List']")
	WebElement txtMyWishList;
	
	public boolean isWishListPageExist()
	{
		try {
			return txtMyWishList.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
}
