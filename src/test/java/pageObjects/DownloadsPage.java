package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsPage extends Basepage{

	public DownloadsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='Account Downloads']")
	WebElement txtDownloads;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public boolean isDownloadsExist()
	{
		try {
			return txtDownloads.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
