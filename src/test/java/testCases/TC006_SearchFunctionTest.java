package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDispayPage;
import testBase.BaseClass;

public class TC006_SearchFunctionTest extends BaseClass{

	@Test(groups= {"Sanity","Master"})
	public void verify_Search()
	{
		logger.info("*** Starting TC006_SearchFunctionTest ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.EnterSearch(p.getProperty("searchProductName"));
			hp.clickSearch();
			
			logger.info("*** Validating Search Result ***");
			
			// Search page
			ProductDispayPage sp = new ProductDispayPage(driver);
			String result = sp.getSearchText();
			
			if(p.getProperty("searchProductName").equals(result))
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
			logger.error("*** Test case failed ***", e);
			Assert.fail("Exception occured "+ e.getMessage());
		}
		
		logger.info("*** Finished TC006_SearchFunctionTest ***");
	}
	
}
