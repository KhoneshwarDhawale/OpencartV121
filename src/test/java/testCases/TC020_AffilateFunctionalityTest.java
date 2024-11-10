package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AffilateInformationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC020_AffilateFunctionalityTest extends BaseClass{

	@Test(groups= {"Regressiion", "Master"})
	public void verify_Affilate()
	{
		logger.info("*** Starting TC020_AffilateFunctionalityTest ***");
		
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
			
			acp.clickAffilateAccount();
			
			logger.info("*** Affilate Information Page ***");
			AffilateInformationPage aip = new AffilateInformationPage(driver);
			boolean affilateInfoPageExist = aip.isAffilateInformationPageExist();
			Assert.assertEquals(affilateInfoPageExist, true);
			
			aip.setCompanyName(p.getProperty("companyName"));
			aip.setWebSite(p.getProperty("webSite"));
			aip.setTaxId(p.getProperty("taxId"));
			aip.clickChequePayeeMethod();
			aip.setChequePayeeName(p.getProperty("chequePayeeName"));
			aip.clickAgree();
			aip.clickContinue();
			boolean alrtAffilateUpdateCheck = acp.isAlertAffilatePresent();
			Assert.assertEquals(alrtAffilateUpdateCheck, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC020_AffilateFunctionalityTest ***");
	}
}
