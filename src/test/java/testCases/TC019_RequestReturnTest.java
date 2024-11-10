package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ProductReturnPage;
import testBase.BaseClass;

public class TC019_RequestReturnTest extends BaseClass{
	
	@Test(groups= {"Regressiion", "Master"})
	public void verify_ReturnRequst()
	{
		logger.info("*** Starting TC019_RequestReturnTest ***");
		
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
			
			acp.clickReturnRequest();
			
			logger.info("*** Product Return Page ***");
			ProductReturnPage prp = new ProductReturnPage(driver);
			boolean productReturnPageExist = prp.isProductReturnExist();
			Assert.assertEquals(productReturnPageExist, true);
			
			prp.clickContinue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC019_RequestReturnTest ***");
	}

}
