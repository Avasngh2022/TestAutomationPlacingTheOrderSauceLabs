import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	ReusableMethods resusableMethods;

	private By usernameBy = By.xpath("//input[@id='user-name']");

	private By passwordBy = By.xpath("//input[@id='password']");

	private By loginBy = By.xpath("//input[@value='Login']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.resusableMethods = new ReusableMethods(driver);
		if (!driver.getTitle().equals("Swag Labs")) {
			throw new IllegalStateException("This is not Login Page," + " current page is: " + driver.getCurrentUrl());
		}
	}

	public void enterUsername(WebDriver driver) {
		driver.findElement(usernameBy).sendKeys("visual_user");
		Assert.assertTrue(true, "Username is Entered");
		resusableMethods.captureScreenshot(driver, "logintestenterusername");
	}

	public void enterPassword(WebDriver driver) {
		driver.findElement(passwordBy).sendKeys("secret_sauce");
		Assert.assertTrue(true, "Password is Entered");
		resusableMethods.captureScreenshot(driver, "logintestenterpassword");
	}

	public void clickLoginButton(WebDriver driver) {
		driver.findElement(loginBy).click();
		resusableMethods.captureScreenshot(driver, "logintestclickloginbutton");

	}

	public void Login(WebDriver driver) {
		enterUsername(driver);
		enterPassword(driver);
		clickLoginButton(driver);
	}
}
