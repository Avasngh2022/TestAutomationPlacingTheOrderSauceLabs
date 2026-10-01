import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	 public void onStart(ITestContext context) {
	        System.out.println("Context started: " + context.getName());
	    }

	 
	    public void onTestStart(ITestResult result) {
	        System.out.println("Running: " + result.getMethod().getMethodName());
	    }

	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Passed: " + result.getMethod().getMethodName());
	    }

	    
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Failed: " + result.getMethod().getMethodName());
	        if (result.getThrowable() != null) {
	            System.out.println("Reason: " + result.getThrowable().getMessage());
	        }
	    }

	  
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Skipped: " + result.getMethod().getMethodName());
	    }

	    public void onFinish(ITestContext context) {
	        System.out.println("Context finished: " + context.getName());
	    }
}
