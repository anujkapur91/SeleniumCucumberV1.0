
//package glueCode;
package stepDefinations;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UILibrary.Actions;
import UILibrary.DriverFactory;
import Utilities.utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import cucumber.api.PendingException;

public class StepDef {
	
	public  WebDriver driver;

//------------------- Actual trials Start  ----------------------------------------
	public static void main(String[] args)
	{
	    
		StepDef sd = new StepDef();
		sd.driver =  DriverFactory.getInstance().getDriver("Chrome");
		sd.driver.get("http://toolsqa.com/automation-practice-table/");
			
		String tableBaseXpath = "";
		
		List <WebElement> rows = sd.driver.findElements(By.xpath(tableBaseXpath + "/tbody/tr/td[1]"));
		int itemColumn = utils.getColumnWithText(sd.driver,"City", tableBaseXpath);
		int actionColumn = utils.getColumnWithText(sd.driver,"...", tableBaseXpath);

		System.out.println(actionColumn);
		
		
		for (int i = 1; i<=rows.size(); i++)
		{
			
				WebElement ele = sd.driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(itemColumn-1)+"]"));
				if (ele.getText().equals("Mecca"))
				{
					ele = sd.driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(actionColumn-2)+"]/a[1]"));
					ele.click();
				}
				System.out.println();
			
		}
		
		sd.driver.close();
		
	    

		
		
	}
	
	@Given("User Launches Amazon Webpage {string}")
	public void user_Launches_Amazon_Webpage_on(String Browser) {

	    driver =  DriverFactory.getInstance().getDriver(Browser); 
	    driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);//
//	    driver = WebdriverSetup.setupBrowserDriver(Browser);
	    System.out.println("Test launched with - "+ Thread.currentThread().getName());   
	    Actions.getURL(driver, "https://www.amazon.in");
	    Actions.click(driver, "TodaysDeal");
//	    throw new cucumber.api.PendingException();
	}

	@When("User Navigates to Login Link")
	public void user_Navigates_to_Login_Link() 
	{
	    
//	    throw new cucumber.api.PendingException();
	}

	@Then("User logins with Username  and Password")
	public void user_logins_with_Username_and_Password() {
//	    System.out.println("user_logins_with_Username_and_Password");
//	    throw new cucumber.api.PendingException();
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
		
//		driver.quit();
//		DriverFactory.getInstance().removeDriver();
//		System.out.println("close");
//		throw new cucumber.api.PendingException();
	}
//	################### HOOKS ##################################################################################################################
	@After
	public void tearDown()
	{
		driver.quit();
		DriverFactory.getInstance().removeDriver();
		System.out.println("##########################   Test Scenario Tear Down  ######################################");
	}
	
	@Before
	public void testCaseInitialization()
	{
		System.out.println("##########################   Test Scenario Initialization on Thread - "+Thread.currentThread().getName()+" with Thread ID - "+Thread.currentThread().getId()+"  ######################################");
		
	}

}
