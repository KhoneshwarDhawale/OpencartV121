package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC011_HomePageTest extends BaseClass {

	@Test(groups= {"Sanity", "Master"})
	public void verify_HomePage()
	{
		logger.info("*** Starting TC011_HomePageTest ***");
		
		try
		{
			logger.info("*** Validating the page title ***");
			HomePage hp = new HomePage(driver);
			String ExpTitle = hp.getPageTitle();
			Assert.assertEquals(ExpTitle, p.getProperty("ActPageTitle"));
			
			logger.info("*** Validating logo ***");
			boolean logoPresent = hp.isLogoPresent();
			Assert.assertEquals(logoPresent, true);
			
			logger.info("*** Validating nav bar items ***");
			List<String> actNavItemsList = hp.listOfNavBarItems();
			
			String expNavItems = p.getProperty("ActListOfnavBarItems");
			List<String> expNavItemsList = Arrays.asList(expNavItems.split(","));
			
			if(actNavItemsList.equals(expNavItemsList)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
				logger.info("Actual nav Bar List : "+ actNavItemsList);
				logger.info("Expected nav Bar List : "+ expNavItemsList);
			}
			
			logger.info("*** Validate Search bar ***");
			hp.EnterSearch(p.getProperty("searchProductName"));
			
			logger.info("*** validating shopping cart icon ***");
			hp.clickShoppingCart();
			ShoppingCartPage sp = new ShoppingCartPage(driver);
			boolean shoppingCartPageExist = sp.isShoppingCartPageExist();
			Assert.assertEquals(shoppingCartPageExist, true);
			driver.navigate().back();
			
			logger.info("*** Validate the presence of my Account option ***");
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
			
			logger.info("*** Validate featured product section ***");
			boolean featuredProductSection = hp.isFeaturedProductDisplayed();
			Assert.assertEquals(featuredProductSection, true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC011_HomePageTest ***");
		
	}
}
