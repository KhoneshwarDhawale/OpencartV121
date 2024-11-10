package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import pageObjects.AccountRegistrationPage;

public class TC012_MyAccountfunctionalityTest extends BaseClass {

	@Test(groups= {"Sanity", "Master"})
	public void verify_MyAccount()
	{
		logger.info("*** Starting TC012_MyAccountfunctionalityTest ***");
		
		try
		{
		logger.info("*** Verify MyAccount dropDown options ***");
		
		HomePage hp = new HomePage(driver);
		String expMyAccount = p.getProperty("MyAccountDrpDownOptions");
		List<String> expMyAccountDrpDwn = Arrays.asList(expMyAccount.split(","));
		hp.clickMyAccount();
		List<String> actMyAccountDrpDwn = hp.myAccountDrpDwn();
		
		if(actMyAccountDrpDwn.equals(expMyAccountDrpDwn)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
			logger.info("Actual MyAccount Options : "+ actMyAccountDrpDwn);
			logger.info("Expected MyAccount Options : "+ expMyAccountDrpDwn);
		}
		
		logger.info("*** Verify Register page ***");
		hp.clickRegister();
		AccountRegistrationPage rp = new AccountRegistrationPage(driver);
		boolean registerPageExist = rp.isRegistrationPageExist();
		Assert.assertEquals(registerPageExist, true);
		driver.navigate().back();

		logger.info("*** Verify Login page ***");
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.isLoginPageExist();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC012_MyAccountfunctionalityTest ***");
	}
}
