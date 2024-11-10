package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductComparePage;
import pageObjects.ProductDispayPage;
import testBase.BaseClass;

public class TC007_ProductCompareTest extends BaseClass{

	@Test(groups= {"Regression", "Master"})
	public void verify_CompareProduct()
	{
		logger.info("*** Starting TC007_ProductCompareTest ***");
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.EnterSearch(p.getProperty("searchProductForCompare"));
			hp.clickSearch();
			
			// Search page
			ProductDispayPage sp = new ProductDispayPage(driver);
			sp.clickCmpMacbook();
			sp.clickCmpMacbookAir();
			
			// Getting Text of products from Search page
			String product1 = sp.getTextMacbook() ;
			String product2 = sp.getTextMacbookAir();
			
			sp.clickProductCompare();
			
			// Product Compare Page
			ProductComparePage pcp = new ProductComparePage(driver);
			boolean validPage = pcp.isProductCmpVisisble();
			
			logger.info("*** Validating Product Compare Page ***");
			
			Assert.assertEquals(validPage, true);
			
			logger.info("*** Comparing Products ***");
			
			// Getting Text of products from Product Compare Page page
			String pcpProduct1 = pcp.getMacbookText();
			String pcpProduct2 = pcp.getMacbookAirText();
			
			logger.info("*** Counting no of Products ***");
			
			// Verify the Products in Comparison list
			List<WebElement> noOfProducts = driver.findElements(By.xpath("//tbody[1]/tr[1]//td//a"));
			if(noOfProducts.size()==2)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			logger.info("*** Validating Compare Products Names ***");
			
			if(product1.equals(pcpProduct1) && product2.equals(pcpProduct2))
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
			Assert.fail();
		}
		
		logger.info("*** Finished TC007_ProductCompareTest ***");
	}
}
