package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC004_LogoutTest extends BaseClass {
	
	@Test(groups = {"Sanity", "Master"})
	public void verfiy_logout()
	{
		logger.info("***** Starting TC004_LogoutTest *****");
		
		try 
		{
			// Home page
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			// Login page
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			// My Account
			logger.info("**** Validating Account login ****");
			
			MyAccountPage myAcc = new MyAccountPage(driver);
			boolean valid = myAcc.isMyAccountPageExist();
			Assert.assertEquals(valid, true);
			
			logger.info("**** Validating Account Logout ****");
			myAcc.clickHeaderMyAccount();
			myAcc.clickHeaderLogout();
			
			AccountLogoutPage accL = new AccountLogoutPage(driver);
			boolean validTxt = accL.isTxtLogoutExist();
			
			Assert.assertEquals(validTxt, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("***** Finish TC004_LogoutTest *****");
	}
}
