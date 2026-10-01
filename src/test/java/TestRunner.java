import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        // 1. Create an instance of the TestNG object
        TestNG testng = new TestNG();

        // 2. Create a list to store your testng.xml suites
        List<String> suites = new ArrayList<String>();
        
        // 3. Add the paths of your XML configuration files
        //suites.add("testng.xml"); 
        suites.add("src/test/resources/testng.xml"); // Example path

        // 4. Set the suites to be executed by the TestNG instance
        testng.setTestSuites(suites);

        // 5. Run the test suites
        testng.run();
    }
}

