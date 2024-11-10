package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GiftCertificatesPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC023_GiftCertificateFunctionalityTest extends BaseClass{

	@Test(groups= {"Regressiion", "Master"})
	public void verify_GiftCertificate()
	{
		logger.info("*** Starting TC023_GiftCertificateFunctionalityTest ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickGiftCertificates();
			
			logger.info("*** Gift Certificate page ***");
			GiftCertificatesPage gp = new GiftCertificatesPage(driver);
			boolean pageExist = gp.isGiftCertificatePageExist();
			Assert.assertEquals(pageExist, true);
			
			logger.info("*** Filling Details ***");
			gp.enterRecipientsName(p.getProperty("recipentsName"));
			gp.enterRecipientsEmail(p.getProperty("recipentsEmail"));
			gp.enterYourName(p.getProperty("name"));
			gp.enterYourEmail(p.getProperty("sampleEmail1"));
			gp.clickThemeBirthday();
			gp.enterMessage(p.getProperty("message"));
			gp.clearAmmount();
			gp.enterAmmount(p.getProperty("ammount"));
			gp.clickAgree();
			gp.clickContinue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC023_GiftCertificateFunctionalityTest ***");
	}
}
