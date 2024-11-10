package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountInfoPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC013_MyAccountInfoTest extends BaseClass {

	@Test(groups= {"Sanity", "Master"})
	public void verify_MyAccountInformation()
	{
		logger.info("*** Starting TC013_MyAccountInfoTest ***");
		
		try
		{
			logger.info("*** Login to Account ***");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			logger.info("*** MyAccount Page ***");
			MyAccountPage acp = new MyAccountPage(driver);
			boolean myAccountPageExist = acp.isMyAccountPageExist();
			Assert.assertEquals(myAccountPageExist, true);
			
			acp.clickAccountInfo();
			
			logger.info("*** MyAccount info Page ***");
			MyAccountInfoPage aip = new MyAccountInfoPage(driver);
			boolean accountInfoShowing = aip.isMyAccountInfoShowing();
			Assert.assertEquals(accountInfoShowing, true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC013_MyAccountInfoTest ***");
	}
}
