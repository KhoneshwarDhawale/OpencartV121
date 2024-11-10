package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCertificatesPage extends Basepage{

	public GiftCertificatesPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()='Purchase a Gift Certificate']")
	WebElement txtGiftCertificate;
	
	@FindBy(xpath="//input[@id='input-to-name']")
	WebElement inpRecipientsName;
	
	@FindBy(xpath="//input[@id='input-to-email']")
	WebElement inpRecipientsEmail;
	
	@FindBy(xpath="//input[@id='input-from-name']")
	WebElement inpYourName;
	
	@FindBy(xpath="//input[@id='input-from-email']")
	WebElement inpYourEmail;
	
	@FindBy(xpath="//input[@value='7']")
	WebElement rdThemeBirthday;
	
	@FindBy(xpath="//textarea[@id='input-message']")
	WebElement inpMessage;
	
	@FindBy(xpath="//input[@id='input-amount']")
	WebElement inpAmmount;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkAgree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public boolean isGiftCertificatePageExist()
	{
		try {
			return txtGiftCertificate.isDisplayed();
		} catch(Exception e) {
			return false;
		}
	}
	public void enterRecipientsName(String rname)
	{
		inpRecipientsName.sendKeys(rname);
	}
	public void enterRecipientsEmail(String remail)
	{
		inpRecipientsEmail.sendKeys(remail);
	}
	public void enterYourName(String yname)
	{
		inpYourName.sendKeys(yname);
	}
	public void enterYourEmail(String yemail)
	{
		inpYourEmail.sendKeys(yemail);
	}
	public void clickThemeBirthday()
	{
		rdThemeBirthday.click();
	}
	public void enterMessage(String msg)
	{
		rdThemeBirthday.sendKeys(msg);;
	}
	public void clearAmmount()
	{
		inpAmmount.clear();
	}
	public void enterAmmount(String amt)
	{
		inpAmmount.sendKeys(amt);
	}
	public void clickAgree()
	{
		chkAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
