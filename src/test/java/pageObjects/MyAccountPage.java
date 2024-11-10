package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	WebElement lnkHeaderLogout;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement inpEnterSearch;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	@FindBy(xpath = "//a[normalize-space()='Edit your account information']")
	WebElement lnkAccountInfo;
	
	@FindBy(xpath = "//a[normalize-space()='Change your password']")
	WebElement lnkChangePassword;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertPasswordUpdated;
	
	@FindBy(xpath = "//a[normalize-space()='Modify your address book entries']")
	WebElement lnkAddressBook;
	
	@FindBy(xpath = "//a[normalize-space()='View your order history']")
	WebElement lnkOrderHistory;
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//a[normalize-space()='Downloads']")
	WebElement lnkDownloads;
	
	@FindBy(xpath = "//a[normalize-space()='Your Reward Points']")
	WebElement lnkRewardPoint;
	
	@FindBy(xpath = "//a[normalize-space()='View your return requests']")
	WebElement lnkReturnRequest;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	WebElement lnkAffilateAccount;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertAffilateUpdated;
	
	@FindBy(xpath = "//a[normalize-space()='Subscribe / unsubscribe to newsletter']")
	WebElement lnkNewsletter;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertNewsletterSubscriptionUpdated;
	
	public boolean isMyAccountPageExist()
	{
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
	public void clickHeaderMyAccount()
	{
		lnkMyAccount.click();
	}
	public void clickHeaderLogout()
	{
		lnkHeaderLogout.click();
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
	public void clickAccountInfo()
	{
		lnkAccountInfo.click();
	}
	public void clickChengePassword()
	{
		lnkChangePassword.click();
	}
	public boolean isAlertPasswordUpdatePresent()
	{
		try {
		return alertPasswordUpdated.isDisplayed();
		} catch(Exception e) {
			return false;
		}
		
	}
	public void clickAddressBook()
	{
		lnkAddressBook.click();
	}
	public void clickOrderHistory()
	{
		lnkOrderHistory.click();
	}
	public void clickDownloads()
	{
		lnkDownloads.click();
	}
	public void clickRewardPoints()
	{
		lnkRewardPoint.click();
	}
	public void clickReturnRequest()
	{
		lnkReturnRequest.click();
	}
	public void clickAffilateAccount()
	{
		lnkAffilateAccount.click();
	}
	public boolean isAlertAffilatePresent()
	{
		try {
			return alertAffilateUpdated.isDisplayed();
			} catch(Exception e) {
				return false;
			}
	}
	public void clickNewsletter()
	{
		lnkNewsletter.click();
	}
	public boolean isAlertNewsletterSubscriptionPresent()
	{
		try {
			return alertNewsletterSubscriptionUpdated.isDisplayed();
			} catch(Exception e) {
				return false;
			}
	}
}
