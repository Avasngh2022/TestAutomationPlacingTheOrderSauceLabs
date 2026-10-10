import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	ReusableMethods resusableMethods;
	LoginPage loginPage;
	AddToCartPage addToCartPage;

	private By checkoutButtonBy = By.xpath("//button[@id='checkout']");
	
	private By continueShoppingButtonBy = By.xpath("//button[@id='continue-shopping']");
	
	private By removeButtonBy = By.xpath("//button[@id='remove-sauce-labs-onesie']");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		this.resusableMethods =new ReusableMethods(driver);
		this.loginPage=new LoginPage(driver);
		this.addToCartPage=new AddToCartPage(driver);
	}
	
	public void checkoutButtonIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(checkoutButtonBy);
		if(element.isDisplayed()) {
			System.out.println("Checkout Button is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "ChekoutPage");
	}
	
	public void continueShoppingButtonIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(continueShoppingButtonBy);
		if(element.isDisplayed()) {
			System.out.println("Continue Shooping Button is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CartPage");
	}
	
	public void removeButtonIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(removeButtonBy);
		if(element.isDisplayed()) {
			System.out.println("Remove Button is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CartPage");
	}
	
	public void clickCheckoutButton(WebDriver driver) {
		driver.findElement(checkoutButtonBy).click();
		resusableMethods.captureScreenshot(driver, "ChekoutStepOnePage");
	}
	
	public void clickContinueShoppingButton(WebDriver driver) {
		driver.findElement(continueShoppingButtonBy ).click();
		resusableMethods.captureScreenshot(driver, "AddToCartPage");
	}
	
	public void clickRemoveButton(WebDriver driver) {
		driver.findElement(removeButtonBy).click();
		resusableMethods.captureScreenshot(driver, "CartPage");
	}

	public void CartPage(WebDriver driver) {
		addToCartPage.addToCart(driver);
		verifyCartPage(driver);
		clickCheckoutButton(driver);
		
	}
	
	public void verifyCartPage(WebDriver driver) {
		checkoutButtonIsPresent(driver);
		continueShoppingButtonIsPresent(driver);
		removeButtonIsPresent(driver);	
	}
	
}
