package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffilateInformationPage extends Basepage{
	
	public AffilateInformationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Your Affiliate Information']")
	WebElement txtAffilateInfo;
	
	@FindBy(xpath="//input[@id='input-company']")
	WebElement inpCompanyName;
	
	@FindBy(xpath="//input[@id='input-website']")
	WebElement inpWebSite;
	
	@FindBy(xpath="//input[@id='input-tax']")
	WebElement inpTaxId;
	
	@FindBy(xpath="//input[@value='cheque']")
	WebElement rdChequePaymentMethod;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	WebElement inpChequePayeeName;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkBoxAgree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public boolean isAffilateInformationPageExist()
	{
		try {
			return txtAffilateInfo.isDisplayed();
		} catch(Exception e) {
			return false;
		}
	}
	public void setCompanyName(String cname)
	{
		inpCompanyName.sendKeys(cname);
	}
	public void setWebSite(String wbsite)
	{
		inpWebSite.sendKeys(wbsite);
	}
	public void setTaxId(String txid)
	{
		inpTaxId.sendKeys(txid);
	}
	public void clickChequePayeeMethod()
	{
		rdChequePaymentMethod.click();
	}
	public void setChequePayeeName(String checkPayee)
	{
		inpChequePayeeName.sendKeys(checkPayee);
	}
	public void clickAgree()
	{
		chkBoxAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
