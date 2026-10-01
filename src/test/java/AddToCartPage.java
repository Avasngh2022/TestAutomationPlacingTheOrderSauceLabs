import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartPage {
	WebDriver driver;
	ReusableMethods resusableMethods;
	LoginPage loginPage;

	private By addToCartButtonBy = By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']");

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		this.resusableMethods =new ReusableMethods(driver);
		this.loginPage=new LoginPage(driver);
	}
	
	public void clickAddToCartButton(WebDriver driver) {
		driver.findElement(addToCartButtonBy).click();
		resusableMethods.captureScreenshot(driver, "addToCartButton");
	}	
	
	public void addToCart(WebDriver driver) {
		loginPage.Login(driver);
		clickAddToCartButton(driver);
		}
}
