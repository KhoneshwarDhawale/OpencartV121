package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDispayPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC008_ProductDisplayDDT extends BaseClass{
	
	@Test(dataProvider="SearchData", dataProviderClass=DataProviders.class, groups= {"Sanity","Master"})
	public void verify_DisplayProducts(String product)
	{
		logger.info("*** Starting TC008_ProductDisplayDDT ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clearSearch();
			hp.EnterSearch(product);
			hp.clickSearch();
			
			logger.info("*** Validating Search Result ***");
			
			// Search page
			ProductDispayPage sp = new ProductDispayPage(driver);
			String result = sp.getSearchText();
			
			if(product.equals(result))
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
		
		logger.info("*** Finished TC008_ProductDisplayDDT ***");

	}
	
	
}
