package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddAddressPage;
import pageObjects.AddressBookPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC015_AddressBookFunctionalityTest extends BaseClass{

	@Test(groups= {"Sanity", "Master"})
	public void verify_AddressBook()
	{
		logger.info("*** Starting TC014_ChangePasswordTest ***");
		
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
			
			acp.clickAddressBook();
			
			logger.info("*** Address Book Page ***");
			AddressBookPage abp = new AddressBookPage(driver);
			boolean addressBookPageExist = abp.isAddressBookPageExist();
			Assert.assertEquals(addressBookPageExist, true);
			abp.clickNewAddress();
			
			logger.info("*** Add Address Book Page ***");
			AddAddressPage aap = new AddAddressPage(driver);
			boolean addAddressPageExist = aap.isAddAddressPageExist();
			Assert.assertEquals(addAddressPageExist, true);
			
			aap.setFirstName(p.getProperty("firstName"));
			aap.setLastName(p.getProperty("lastName"));
			aap.setCompanyName(p.getProperty("company"));
			aap.setAddres1(p.getProperty("address1"));
			aap.setAddress2(p.getProperty("address2"));
			aap.setCityName(p.getProperty("city"));
			aap.setpostalCode(p.getProperty("postCode"));
			aap.selectCountry(p.getProperty("country"));
			aap.selectState(p.getProperty("state"));
			aap.clickContinue();
			
			logger.info("*** Verify Address Added ***");
			boolean alertPresent = abp.isAlertAddedToAddressBookPresent();
			Assert.assertEquals(alertPresent, true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC014_ChangePasswordTest ***");
	}
	
}
