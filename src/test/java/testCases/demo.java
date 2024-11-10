package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		/*
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iPhone");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		//Thread.sleep(3000);
		//String txt = driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		//System.out.println(txt);
		
		driver.findElement(By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).click();
		
		boolean rrr = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')]")).isDisplayed();
		
		System.out.println("Page Exist : " +rrr);
		
		WebElement pQty = driver.findElement(By.xpath("//div[@class='input-group btn-block']//input"));
		String value = pQty.getAttribute("value");
		System.out.println("Quantity : " + value);
		/*
		/*
		driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]")).click();
		driver.findElement(By.xpath("//div[@id='content']//div[2]//div[1]//div[2]//div[2]//button[3]")).click();
		*/
		
		
	}
}
