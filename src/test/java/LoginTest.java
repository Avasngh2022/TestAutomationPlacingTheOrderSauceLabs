import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testLogin() {
		driver.get("https://www.saucedemo.com/");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login(driver);		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}