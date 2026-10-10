import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckoutStepOnePage {
	WebDriver driver;
	ReusableMethods resusableMethods;
	LoginPage loginPage;
	AddToCartPage addToCartPage;
	CartPage cartPage;

	private By checkoutStepOneFirstName = By.xpath("//input[@id='first-name']");
	
	private By checkoutStepOneLastName = By.xpath("//input[@id='last-name']");
	
	private By checkoutStepOnePostalCode = By.xpath("//input[@id='postal-code']");
	
	private By checkoutStepOneContinue = By.xpath("//input[@id='continue']");
	
	private By checkoutStepOneCancel = By.xpath("//input[@id='cancel']");
	
	private By checkoutStepOneShoppingCartLink = By.xpath("//input[@id='first-name']/preceding::a[contains(@aria-label,'Cart')]");
	
	private By checkoutStepOneCheckoutYourInformationTitle = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
	
	public CheckoutStepOnePage(WebDriver driver) {
		this.driver = driver;
		this.resusableMethods =new ReusableMethods(driver);
		this.loginPage=new LoginPage(driver);
		this.cartPage=new CartPage(driver);
	}
	
	public void enterCheckoutStepOneFirstName(WebDriver driver) {
		driver.findElement(checkoutStepOneFirstName).sendKeys("Avanish");
		Assert.assertTrue(true, "First Name is Entered");
		resusableMethods.captureScreenshot(driver, "checkoutsteponetestenterCheckoutStepOneFirstName");
	}

	public void enterCheckoutStepOneLastName(WebDriver driver) {
		driver.findElement(checkoutStepOneLastName).sendKeys("Kumar Singh");
		Assert.assertTrue(true, "Last Name is Entered");
		resusableMethods.captureScreenshot(driver, "checkoutsteponetestenterCheckoutStepOneLastName");
	}

	public void enterCheckoutStepOnePostalCode(WebDriver driver) {
		driver.findElement(checkoutStepOnePostalCode).sendKeys("221002");
		Assert.assertTrue(true, "Postal Code is Entered");
		resusableMethods.captureScreenshot(driver, "checkoutsteponetestentercheckoutStepOnePostalCode");
	
	}
	
	public void clickCheckoutStepOneContinueButton(WebDriver driver) {
		driver.findElement(checkoutStepOneContinue).click();
		resusableMethods.captureScreenshot(driver, "checkoutsteponetestclickCheckoutStepOneContinueButton");

	}
	public void clickCheckoutStepOneCancelButton(WebDriver driver) {
		driver.findElement(checkoutStepOneCancel).click();
		resusableMethods.captureScreenshot(driver, "checkoutsteponetestclickCheckoutStepOneCancelButton");
	}
	
	public void checkoutStepOneShoppingCartLinkIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(checkoutStepOneShoppingCartLink);
		if(element.isDisplayed()) {
			System.out.println("checkoutStepOneShoppingCartLink is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CheckoutStepOnePage");
	}
	
	public void checkoutStepOneVerifyCheckoutYourInformationTitleIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(checkoutStepOneCheckoutYourInformationTitle);
		if(element.isDisplayed()) {
			System.out.println("checkoutStepOneCheckoutYourInformationTitle is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CheckoutStepOnePage");
	}
	
	public void checkoutStepOneContinueButtonIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(checkoutStepOneContinue);
		if(element.isDisplayed()) {
			System.out.println("Checkout Step One Continue Button is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CheckoutStepOnePage");
	}
	
	public void checkoutStepOneCancelButtonIsPresent(WebDriver driver) {
		WebElement element=driver.findElement(checkoutStepOneCancel);
		if(element.isDisplayed()) {
			System.out.println("checkoutStepOneCancelButton is Displayed");
		}
		resusableMethods.captureScreenshot(driver, "CheckoutStepOnePage");
	}
	public void checkoutStepOnePage(WebDriver driver) {
		verifyCheckoutStepOnePage(driver);
		enterCheckoutStepOneCheckoutInformation(driver);
		clickCheckoutStepOneContinueButton(driver);	
	}
	
	public void verifyCheckoutStepOnePage(WebDriver driver) {
		checkoutStepOneShoppingCartLinkIsPresent(driver);
		checkoutStepOneVerifyCheckoutYourInformationTitleIsPresent(driver);
		checkoutStepOneContinueButtonIsPresent(driver);		
		checkoutStepOneCancelButtonIsPresent(driver);	
	} 
	
	public void enterCheckoutStepOneCheckoutInformation(WebDriver driver) {
		enterCheckoutStepOneFirstName(driver);
		enterCheckoutStepOneLastName(driver);
		enterCheckoutStepOnePostalCode(driver);
	}
	
}
