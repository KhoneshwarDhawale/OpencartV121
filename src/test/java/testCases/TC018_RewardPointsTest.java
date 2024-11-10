package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.RewardPointPage;
import testBase.BaseClass;

public class TC018_RewardPointsTest extends BaseClass{

	@Test(groups= {"Regressiion", "Master"})
	public void verify_RewardPoint()
	{
		logger.info("*** Starting TC018_RewardPointsTest ***");
		
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
			
			acp.clickRewardPoints();
			
			logger.info("*** Reward Points Page ***");
			RewardPointPage rp = new RewardPointPage(driver);
			boolean rewardPointPageExist = rp.isRewardPointExist();
			Assert.assertEquals(rewardPointPageExist, true);
			
			rp.clickContinue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC018_RewardPointsTest ***");
	}
}
