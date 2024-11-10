package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactusPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC022_ContactusFunctionalityTest extends BaseClass{

	@Test(groups= {"Regressiion", "Master"})
	public void verify_contactus()
	{
		logger.info("*** Starting TC022_ContactusFunctionalityTest ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickContactus();
			
			logger.info("*** Conatct us page ***");
			ContactusPage cp = new ContactusPage(driver);
			boolean pageExist = cp.isContactusPageExist();
			Assert.assertEquals(pageExist, true);
			
			cp.enterName(p.getProperty("name"));
			cp.enterEmail(p.getProperty("sampleEmail1"));
			cp.enterEnquiry(p.getProperty("enquiry"));
			cp.clickSubmit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC022_ContactusFunctionalityTest ***");
	
	}
}
