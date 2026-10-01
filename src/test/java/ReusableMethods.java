import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ReusableMethods {
    protected WebDriver driver;
	public ReusableMethods(WebDriver driver) {
		this.driver = driver;
	}
	 public void captureScreenshot(WebDriver driver, String fileName) {
	        try {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            File destination = new File("C:\\Users\\DELL\\TestAutomationPlacingTheOrder\\TestAutomationPlacingTheOrder\\Screenshots\\"+ fileName + ".png");
	            FileHandler.copy(source, destination);
	            System.out.println("Screenshot saved successfully.");
	        } catch (Exception e) {
	            System.out.println("Failed to capture screenshot: " + e.getMessage());
	        }
	    }
}
