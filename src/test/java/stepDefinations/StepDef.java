
//package glueCode;
package stepDefinations;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.datetime.FastDateFormat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.sun.javafx.collections.MappingChange.Map;

import UILibrary.Actions;
import UILibrary.DriverFactory;
import Utilities.ExtentreportUtil;
import Utilities.ReportException;
import Utilities.utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

//import cucumber.api.PendingException;

public class StepDef {

	public  WebDriver driver;
	public  static String PageName =null;
	ExtentTest info;


	//------------------- Actual trials Start  ----------------------------------------
	
	@Given("User Launches Amazon Webpage {string}")
	public void user_Launches_Amazon_Webpage_on(String Browser) 
	{
		PageName = "MainPage_";
		driver =  DriverFactory.getInstance().getDriver("firefox"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//
		//	    driver = WebdriverSetup.setupBrowserDriver(Browser);
		Actions.getURL(driver, "https://www.amazon.in");
		//		Actions.click(driver, "TodaysDeal");
//				Assert.assertEquals(driver.getCurrentUrl(), driver.getCurrentUrl()+" ");

		//		info.info("Test");
		//	    throw new cucumber.api.PendingException();
	}

	@When("User Navigates to Login Link")
	public void user_Navigates_to_Login_Link() 
	{
		
			Actions.click(driver, "HelloSignIn");
		 
//		Actions.click(driver, "LoginLink");
	}

	@Then("User logins with Username  and Password")
	public void user_logins_with_Username_and_Password(DataTable table) {
		
		
			List<java.util.Map<String,String>> m = table.asMaps(String.class,String.class);
			Actions.sendKeys(driver, "EmailMobileNumberField", m.get(0).get("Username"));
			Actions.click(driver, "ContinueAfterEmailMobileNumber");
			Actions.sendKeys(driver, "PasswordField", m.get(0).get("Password"));
			Actions.click(driver, "KeepMeSignedIn");
//			Actions.assertFalse();
//			Assert.assertEquals("Validation name", "abcd", "qwerty");
			//			ExtentreportUtil.result("Fail", "Test FAIL");
			//Actions.click(driver, "LogInButton");
		
	}

	@Then("User types {string} {string} name and searches and selects the first listing")
	public void user_types_name_and_searches_and_selects_the_first_listing(String Product, String Model) 
	{
		System.out.println(Product +" " + Model);
//		Actions.sendKeys(driver, "ProductSearchWebEdit", Product +" " + Model);

	}

	@Then("User goes to cart and removes the product")
	public void user_goes_to_cart_and_removes_the_product() {

	}



	@Then("User Logs Out")
	public void user_Logs_Out() 
	{
		// Write code here that turns the phrase above into concrete actions
		//	    throw new cucumber.api.PendingException();
	}

	@Then("User closes Browser")
	public void user_closes_Browser() 
	{

	}
	
	//	################### HOOKS ##################################################################################################################
	
	@After
	public void afterScenario(Scenario scenario){

		driver.quit();
		DriverFactory.getInstance().removeDriver();
		System.out.println("##########################   Test Scenario Tear Down  ######################################");
		ExtentreportUtil.flushAll();

	}
	//	@After
	//	public void tearDown()
	//	{
	//		driver.quit();
	//		DriverFactory.getInstance().removeDriver();
	//		System.out.println("##########################   Test Scenario Tear Down  ######################################");
	//	}

	@Before
	public void testCaseInitialization(Scenario scenario)
	{
		System.out.println("##########################   Test Scenario Initialization on Thread - "+Thread.currentThread().getName()+" with Thread ID - "+Thread.currentThread().getId()+"  ######################################");
//		ExtentreportUtil ext = new ExtentreportUtil();
		ExtentreportUtil.setExtent(scenario);
		
		
	}

}
