package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC005_ForgotPassword extends BaseClass {

	@Test(groups = {"Sanity", "Master"})
	public void verfify_ForgotPassword()
	{
		logger.info("*** Starting TC005_ForgotPassword ***");
		
		try 
		{
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.clickForgotPassword();
			
			logger.info("*** Start Forgot Password ***");
			
			// Forgot Password Page
			ForgotPasswordPage fp = new ForgotPasswordPage(driver);
			fp.EnterEmail(p.getProperty("email"));
			fp.clickContinue();
			
			logger.info("*** Validating Alert ***");
			
			boolean alertCheck = lp.isAlertVisible();
			Assert.assertEquals(alertCheck, true);
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*** Finish TC005_ForgotPassword ***");
	}
}
