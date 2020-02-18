package stepDefinations;

//import org.junit.AfterClass;
//import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import net.serenitybdd.cucumber.CucumberWithSerenity;



//@RunWith(CucumberWithSerenity.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features"
,glue= {"stepDefinations"}
,dryRun = false
,plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true
)
//,,"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extent_report.html"
public class RunCucumberTest 
{
	
	
//	 @AfterClass
//	    public static void setup() {
//	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	        Reporter.setSystemInfo("os", "Mac OSX");
//	        Reporter.setTestRunnerOutput("Sample test runner output message");
//	    }
//	
//	@After
//	
//	public static void tearDown() {
//		
//		DriverFactory.getInstance().removeDriver();
//		
//	}

}


	