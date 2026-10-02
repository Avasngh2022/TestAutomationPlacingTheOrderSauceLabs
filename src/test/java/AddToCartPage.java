import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.reactivex.rxjava3.functions.Action;

public class AddToCartPage {
	WebDriver driver;
	ReusableMethods resusableMethods;
	LoginPage loginPage;

	private By addToCartButtonBy = By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']");
	
	private By addToCartIconButtonBy = By.xpath("//a[@role='button' and contains(@aria-label,'Cart')]");
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		this.resusableMethods =new ReusableMethods(driver);
		this.loginPage=new LoginPage(driver);
	}
	
	public void clickAddToCartButton(WebDriver driver) {
		driver.findElement(addToCartButtonBy).click();
		resusableMethods.captureScreenshot(driver, "addToCartButton");
	}	
	
	public void doubleClickAddToCartIconButton(WebDriver driver) {
		WebElement element=driver.findElement(addToCartIconButtonBy);
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
		resusableMethods.captureScreenshot(driver, "CartPage");
	}	
	
	public void addToCart(WebDriver driver) {
		loginPage.Login(driver);
		clickAddToCartButton(driver);
		doubleClickAddToCartIconButton(driver);
		}
}
