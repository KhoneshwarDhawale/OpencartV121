package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RewardPointPage extends Basepage{

	public RewardPointPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Your Reward Points']")
	WebElement txtRewardPoint;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public boolean isRewardPointExist()
	{
		try {
			return txtRewardPoint.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
