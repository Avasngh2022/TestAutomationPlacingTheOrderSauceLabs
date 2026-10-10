import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartPageTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		 ChromeOptions options = new ChromeOptions();
	     options.setBrowserVersion("153");
	    WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
    @Test
	public void testCartPage() {
		driver.get("https://www.saucedemo.com/");
		CartPage cartPage = new CartPage(driver);
		cartPage.CartPage(driver);	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
