package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DownloadsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC017_DownloadsTest extends BaseClass{

	@Test(groups= {"Sanity", "Master"})
	public void verify_Downloads()
	{
		logger.info("*** Starting TC017_DownloadsTest ***");
		
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
			
			acp.clickDownloads();
			logger.info("*** Downloads Page ***");
			DownloadsPage dp = new DownloadsPage(driver);
			boolean downloadPageExist = dp.isDownloadsExist();
			Assert.assertEquals(downloadPageExist, true);
			
			dp.clickContinue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC017_DownloadsTest ***");
	}
}
