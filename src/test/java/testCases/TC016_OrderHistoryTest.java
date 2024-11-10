package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.OrderHistoryPage;
import testBase.BaseClass;

public class TC016_OrderHistoryTest extends BaseClass{

	@Test(groups= {"Regressiion", "Master"})
	public void verify_OrderHistory()
	{
		logger.info("*** Starting TC016_OrderHistoryTest ***");
		
		try {
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
			
			acp.clickOrderHistory();
			
			logger.info("*** Order History Page ***");
			OrderHistoryPage op = new OrderHistoryPage(driver);
			boolean orderHistoryPageExist = op.isOrderPageExist();
			Assert.assertEquals(orderHistoryPageExist, true);
			
			op.clickContinue();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC016_OrderHistoryTest ***");
	}
}
