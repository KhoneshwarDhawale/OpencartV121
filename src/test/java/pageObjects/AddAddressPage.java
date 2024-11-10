package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage extends Basepage{

	public AddAddressPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Add Address']")
	WebElement txtAddAddress;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement inpFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement inpLastName;
	@FindBy(xpath = "//input[@id='input-company']")
	WebElement inpCompany;
	@FindBy(xpath = "//input[@id='input-address-1']")
	WebElement inpAddress1;
	@FindBy(xpath = "//input[@id='input-address-2']")
	WebElement inpAddress2;
	@FindBy(xpath = "//input[@id='input-city']")
	WebElement inpCity;
	@FindBy(xpath = "//input[@id='input-postcode']")
	WebElement inpPostCode;
	@FindBy(xpath = "//select[@id='input-country']")
	WebElement selectCountry;
	@FindBy(xpath = "//select[@id='input-zone']")
	WebElement selectState;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	public boolean isAddAddressPageExist()
	{
		try {
			return txtAddAddress.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void setFirstName(String fname)
	{
		inpFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		inpLastName.sendKeys(lname);
	}
	public void setCompanyName(String company)
	{
		inpCompany.sendKeys(company);
	}
	public void setAddres1(String add1)
	{
		inpAddress1.sendKeys(add1);
	}
	public void setAddress2(String add2)
	{
		inpAddress2.sendKeys(add2);
	}
	public void setCityName(String city)
	{
		inpCity.sendKeys(city);
	}
	public void setpostalCode(String pstcd)
	{
		inpPostCode.sendKeys(pstcd);
	}
	public void selectCountry(String cname)
	{
		Select drpCountry = new Select(selectCountry);
		drpCountry.selectByVisibleText(cname);
	}
	public void selectState(String sname)
	{
		Select drpCountry = new Select(selectState);
		drpCountry.selectByVisibleText(sname);
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
