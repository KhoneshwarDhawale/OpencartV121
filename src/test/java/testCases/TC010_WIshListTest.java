package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.MyWishListPage;
import pageObjects.ProductDispayPage;
import testBase.BaseClass;

public class TC010_WIshListTest extends BaseClass{
	
	@Test(groups= {"Regressiion", "Master"})
	public void verify_WishList()
	{
		logger.info("*** Starting TC010_WIshListTest ***");
		
		try {
		
		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		logger.info("*** Log In ***");
		
		// LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		// MyAccount
		MyAccountPage mac = new MyAccountPage(driver);
		boolean myAccountPage = mac.isMyAccountPageExist();
		Assert.assertEquals(myAccountPage, true);
		
		logger.info("*** Searching Product ***");
		
		mac.EnterSearch(p.getProperty("searchProductName"));
		mac.clickSearch();
		
		logger.info("*** Adding To Wish List ***");
		
		// Product Display Page
		ProductDispayPage pdp = new ProductDispayPage(driver);
		pdp.addToWishList();
		pdp.clickWishList();
		
		logger.info("*** Validating Wish List Page***");
		
		// Wish List page
		MyWishListPage wp = new MyWishListPage(driver);
		boolean WishListPagePresent = wp.isWishListPageExist();
		Assert.assertEquals(WishListPagePresent, true);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
		logger.info("*** Finished TC010_WIshListTest ***");
	}
	
}
