package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDispayPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC009_AddToCartTest extends BaseClass{
	
	@Test(groups= {"Regression", "Master"})
	public void verify_AddToCartTest()
	{
		logger.info("*** Starting TC009_AddToCartTest ***");
		
		try
		{
			logger.info("*** Searching Product ***");
			
			HomePage hp = new HomePage(driver);
			hp.EnterSearch(p.getProperty("searchProductName"));
			hp.clickSearch();
			
			// Product display page
			ProductDispayPage pdp = new ProductDispayPage(driver);
			
			logger.info("*** Adding to Cart ***");
			pdp.clickAddToCart();
			
			logger.info("*** Checking Add To cart Alert ***");
			boolean alertPresent = pdp.isAddedToCartAlertPresent();
			Assert.assertEquals(alertPresent, true);
			
			pdp.clickShoppingCart();
			
			logger.info("*** Shopping Cart Page ***");
			
			// Shopping Cart Page
			ShoppingCartPage sp = new ShoppingCartPage(driver);
			Thread.sleep(2000);
			boolean shoppingCartPage = sp.isShoppingCartPageExist();
			
			Assert.assertEquals(shoppingCartPage, true);
			
			logger.info("*** Validating Product ***");
			
			String productName = sp.getProductName();
			
			logger.info("*** Validating Product Name ***");
			if(p.getProperty("searchProductName").equals(productName))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			logger.info("*** Validating Product Quanity***");
			int productQty = sp.getProductQuantity();
			if(productQty==1)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC009_AddToCartTest ***");
	}
}
