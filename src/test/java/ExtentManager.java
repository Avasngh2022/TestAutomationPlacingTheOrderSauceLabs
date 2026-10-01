import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        if (extent == null) {
        	 ExtentSparkReporter sparkReporter= new ExtentSparkReporter("C:\\Users\\DELL\\TestAutomationPlacingTheOrder\\TestAutomationPlacingTheOrder\\reports\\myreport.html");	 
        	 sparkReporter.config().setDocumentTitle("Automation Report");
        	 sparkReporter.config().setReportName("Automation Selenium Java");
        	 sparkReporter.config().setTheme(Theme.DARK);
        	 
        	 extent = new ExtentReports();
        	 extent.attachReporter(sparkReporter);
        	 extent.setSystemInfo("Browser","Chrome");
        	 extent.setSystemInfo("Computer","localhost");
        	 extent.setSystemInfo("Tester","Avanish Kumar Singh");
        	 extent.setSystemInfo("os","windows11");
        	 extent.setSystemInfo("Environment","QA"); 
        }
        return extent;
    }
}
