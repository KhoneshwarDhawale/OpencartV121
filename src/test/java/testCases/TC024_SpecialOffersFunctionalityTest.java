package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SpecialOffersPage;
import testBase.BaseClass;

public class TC024_SpecialOffersFunctionalityTest extends BaseClass{

	@Test(groups= {"Regression", "Master"})
	public void verify_specialOffers()
	{
		logger.info("*** Starting TC024_SpecialOffersFunctionalityTest ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickSpecialOffers();
			
			logger.info("*** Special Offers page ***");
			SpecialOffersPage sp = new SpecialOffersPage(driver);
			boolean pageExist = sp.isSpecialOfferPageExist();
			Assert.assertEquals(pageExist, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC024_SpecialOffersFunctionalityTest ***");
		
	}
}
