package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends Basepage{

	public AddressBookPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Address Book Entries']")
	WebElement txtAddressBookEntries;
	
	@FindBy(xpath = "//a[normalize-space()='New Address']")
	WebElement btnNewAddress;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertAddedAddressBook;
	
	public boolean isAddressBookPageExist()
	{
		try {
		return txtAddressBookEntries.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickNewAddress()
	{
		btnNewAddress.click();
	}
	public boolean isAlertAddedToAddressBookPresent()
	{
		try {
			return alertAddedAddressBook.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
}
