import java.io.File;
import org.openqa.selenium.io.FileHandler;
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
		resusableMethods= new ReusableMethods(driver);
		if (!driver.getTitle().equals("Swag Labs")) {
			throw new IllegalStateException(
					"This is not Login Page," + " current page is: " + driver.getCurrentUrl());
		}
	}
		
		public void Login(WebDriver driver) {
			driver.findElement(usernameBy).sendKeys("visual_user");
			driver.findElement(passwordBy).sendKeys("secret_sauce");
			driver.findElement(loginBy).click();
			resusableMethods.captureScreenshot(driver, "logintest");
			
	}
}
