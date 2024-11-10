package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC014_ChangePasswordTest extends BaseClass{

	@Test(groups= {"Sanity", "Master"})
	public void verify_ChangePassword()
	{
		logger.info("*** Starting TC014_ChangePasswordTest ***");
		
		try
		{
			logger.info("*** Login to Account ***");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("sampleEmail"));
			lp.setPassword(p.getProperty("samplePass"));
			lp.clickLogin();
			
			logger.info("*** MyAccount Page ***");
			MyAccountPage acp = new MyAccountPage(driver);
			boolean myAccountPageExist = acp.isMyAccountPageExist();
			Assert.assertEquals(myAccountPageExist, true);
			
			acp.clickChengePassword();
			
			logger.info("*** Change Password Page ***");
			ChangePasswordPage cpp = new ChangePasswordPage(driver);
			boolean changePasswordPageExiste = cpp.isChangePasswordPageExist();
			Assert.assertEquals(changePasswordPageExiste, true);
			
			cpp.setPassword(p.getProperty("changePass"));
			cpp.setConfirmPassword(p.getProperty("changePass"));
			cpp.clickContinue();
			
			logger.info("*** Verify Update Password ***");
			boolean alertPasswordPresent = acp.isAlertPasswordUpdatePresent();
			Assert.assertEquals(alertPasswordPresent, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC014_ChangePasswordTest ***");
		
	}
}
