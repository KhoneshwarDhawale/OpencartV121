package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.NewsletterSubscriptionPage;
import testBase.BaseClass;

public class TC021_NewsletterFunctionalityTest extends BaseClass{
	
	@Test(groups= {"Regressiion", "Master"})
	public void verify_Newsletter()
	{
		logger.info("*** Starting TC021_NewsletterFunctionalityTest ***");
		
		try
		{
			logger.info("*** Login to Account ***");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("sampleEmail"));
			lp.setPassword(p.getProperty("changePass"));
			lp.clickLogin();
			
			logger.info("*** MyAccount Page ***");
			MyAccountPage acp = new MyAccountPage(driver);
			boolean myAccountPageExist = acp.isMyAccountPageExist();
			Assert.assertEquals(myAccountPageExist, true);
			
			acp.clickNewsletter();
			
			logger.info("*** Newsleter Page ***");
			NewsletterSubscriptionPage np = new NewsletterSubscriptionPage(driver);
			boolean newsletterSubscriptionPageExist = np.isNewsletterSubscriptionPageExist();
			Assert.assertEquals(newsletterSubscriptionPageExist, true);
			np.clickYesSubscribe();
			np.clickContinue();
			
			boolean alertNewsletter = acp.isAlertNewsletterSubscriptionPresent();
			Assert.assertEquals(alertNewsletter, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC021_NewsletterFunctionalityTest ***");
	}

}
