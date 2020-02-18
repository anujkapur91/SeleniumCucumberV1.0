
//package glueCode;
package stepDefinations;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.datetime.FastDateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.sun.javafx.collections.MappingChange.Map;

import UILibrary.Actions;
import UILibrary.DriverFactory;
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
	//	public static void main(String[] args)
	//	{
	//	    
	//		StepDef sd = new StepDef();
	//		sd.driver =  DriverFactory.getInstance().getDriver("Chrome");
	//		sd.driver.get("http://toolsqa.com/automation-practice-table/");
	//			
	//		String tableBaseXpath = "";
	//		
	//		List <WebElement> rows = sd.driver.findElements(By.xpath(tableBaseXpath + "/tbody/tr/td[1]"));
	//		int itemColumn = utils.getColumnWithText(sd.driver,"City", tableBaseXpath);
	//		int actionColumn = utils.getColumnWithText(sd.driver,"...", tableBaseXpath);
	//
	//		System.out.println(actionColumn);
	//		
	//		
	//		for (int i = 1; i<=rows.size(); i++)
	//		{
	//			
	//				WebElement ele = sd.driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(itemColumn-1)+"]"));
	//				if (ele.getText().equals("Mecca"))
	//				{
	//					ele = sd.driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(actionColumn-2)+"]/a[1]"));
	//					ele.click();
	//				}
	//				System.out.println();
	//			
	//		}
	//		
	//		sd.driver.close();
	//		
	//	    
	//
	//		
	//		
	//	}

	@Given("User Launches Amazon Webpage {string}")
	public void user_Launches_Amazon_Webpage_on(String Browser) 
	{
		PageName = "MainPage_";
		driver =  DriverFactory.getInstance().getDriver("firefox"); 
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);//
		//	    driver = WebdriverSetup.setupBrowserDriver(Browser);
		System.out.println("Test launched with - "+ Thread.currentThread().getName());   
		Actions.getURL(driver, "https://www.amazon.in");
		//		Actions.click(driver, "TodaysDeal");
		//		Assert.assertEquals("ABC", "AC");

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
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$    " +m.size());
		
		for (int k=0; k<m.size();k++)
		{
			System.out.println(k);
			System.out.println("K =" + k + " " + m.get(k));
		}
		
		
//		table.cell(1, 0).toString()
		Actions.sendKeys(driver, "EmailMobileNumberField", m.get(0).get("Username"));
		Actions.click(driver, "ContinueAfterEmailMobileNumber");
		Actions.sendKeys(driver, "PasswordField", m.get(0).get("Password"));
		Actions.click(driver, "KeepMeSignedIn");
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
	//	@AfterStep
	//	public void afterStep(Scenario scenario)
	//	{
	//		Date myDate = new Date();
	//		FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd:HH-mm-ss");
	//		String myDateString = fdf.format(myDate);
	//
	//		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	//		scenario.embed(screenshot, "image/png");
	//		
	//	}
	@After
	public void afterScenario(Scenario scenario){

		driver.quit();
		DriverFactory.getInstance().removeDriver();
		System.out.println("##########################   Test Scenario Tear Down  ######################################");

	}
	//	@After
	//	public void tearDown()
	//	{
	//		driver.quit();
	//		DriverFactory.getInstance().removeDriver();
	//		System.out.println("##########################   Test Scenario Tear Down  ######################################");
	//	}

	@Before
	public void testCaseInitialization()
	{
		System.out.println("##########################   Test Scenario Initialization on Thread - "+Thread.currentThread().getName()+" with Thread ID - "+Thread.currentThread().getId()+"  ######################################");

	}

}
