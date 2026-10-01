import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
 public ExtentSparkReporter sparkReporter;
 //public ExtentReports extent;
 //public ExtentTest test;
 
 public static ExtentReports extent = ExtentManager.createInstance();
 public static ExtentTest test;
 public void onTestStart(ITestResult result) {
 /*ExtentSparkReporter sparkReporter= new ExtentSparkReporter("C:\\Users\\DELL\\TestAutomationPlacingTheOrder\\TestAutomationPlacingTheOrder\\reports\\myreport.html");	 
 sparkReporter.config().setDocumentTitle("Automation Report");
 sparkReporter.config().setReportName("Automation Selenium Java");
 sparkReporter.config().setTheme(Theme.DARK);
 
 extent = new ExtentReports();
 extent.attachReporter(sparkReporter);
 extent.setSystemInfo("Browser","Chrome");
 extent.setSystemInfo("Computer","localhost");
 extent.setSystemInfo("Tester","Avanish Kumar Singh");
 extent.setSystemInfo("os","windows11");
 extent.setSystemInfo("Environment","QA"); */
	// test = extent.createTest(result.getMethod().getMethodName());
   //  test.set
 }

 public void onTestSuccess(ITestResult result) {
  test=extent.createTest(result.getName());
  test.log(Status.PASS, "Test Case is Passed : " + result.getName());
 }

 public void onTestSkipped(ITestResult result) {
	 test=extent.createTest(result.getName());
	 test.log(Status.SKIP, "Test Case is Skipped : " + result.getName());
 }

 public void onTestFailure(ITestResult result) {
	 test=extent.createTest(result.getName());
	 test.log(Status.FAIL, "Test Case is failed : " + result.getName());
	 test.log(Status.FAIL, "Test Case failed cause: " + result.getThrowable());
 }
 
 public void onFinish(ITestContext context) {
	 if (extent != null) {
         extent.flush();
 }
 }
}
