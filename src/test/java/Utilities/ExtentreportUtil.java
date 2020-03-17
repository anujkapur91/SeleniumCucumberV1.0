package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.reporter.ExtentBDDReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;

public class ExtentreportUtil {
	
	
	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest exTest;
	static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("/cucumbertrials/test-output/HtmlReport2/myReports.html");
	public static Scenario scnro;

	
//	public ExtentreportUtil(Scenario scnro)
//	{
//		
//	this.scnro = scnro;
//	
//	}

	

	public static void setExtent(Scenario scenario)
	{
		extent.attachReporter(htmlReporter);
		System.out.println("setExtent - " + scenario.getName());
		exTest = extent.createTest(scenario.getName());
		
		
	}
	
	public static void result(String step, String result, String resultDetails)
	{
		switch(result.toUpperCase())
		{
		case "PASS" :
			exTest.createNode(step).pass(resultDetails);
			
			
			break;
		case "FAIL":
			exTest.createNode(step).fail(resultDetails);
			
			break;
		default :
			System.out.println("Pass correct result");
			
		}
		
	
		
		
		
		
	}
	
	public static void flushAll()
	{
		extent.flush();
	}

}
