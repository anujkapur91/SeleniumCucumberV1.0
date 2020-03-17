package UILibrary;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;

import UserDefinedExceptions.LocatorTypeException;
import Utilities.ReportException;
import Utilities.locatorRepo;
import Utilities.screenshots;
import Utilities.utils;




public class Actions {

	WebElement element;
	static ExtentTest info;

	private static final Logger logwriter = LogManager.getLogger(Actions.class);


	
	public static void click(WebDriver driver,String ObjName) 
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);


			try {

				WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 
				//WebElement ele = driver.findElement(locatorRepo.getElementRef(ObjName));
				ele.click();
				logwriter.info("Object - " + ObjName+ " clicked");

			} catch (NoSuchElementException e) 
			{
				logwriter.error("Object :" + ObjName + " not available on screen");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}




	}
	
	public static void assertFalse()
	{
		Assert.assertEquals("Validation name", "abcd", "qwerty");	
	
	}

	public static void sendKeys(WebDriver driver,String ObjName, String text) 
	{
		try {
			//				WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 
			WebElement ele = driver.findElement(locatorRepo.getElementRef(ObjName));
			ele.clear();
			ele.sendKeys(text);
			logwriter.info("Object - " + ObjName+ " clicked");
		} catch (Exception e) {
			//				e.printStackTrace();
			ReportException.reportExceptionToExtentReport(e);
			

		}




	}

	public static void getURL(WebDriver driver,String url)
	{
		try {
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println(driver.getWindowHandle());
			logwriter.info("Browser with URL : " +url + " opened");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}


	}

	public static void scrollTo(WebDriver driver, String ObjName) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].scrollIntoView();", ele);

			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void selectByValue(WebDriver driver, String ObjName,String selection) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{
				Select slct = new Select(driver.findElement(locatorRepo.getElementRef(ObjName)));
				
							
				slct.selectByValue(selection);
			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void selectByIndex(WebDriver driver, String ObjName,int selection) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{
				Select slct = new Select(driver.findElement(locatorRepo.getElementRef(ObjName)));
				slct.selectByIndex(selection);

			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void selectByVisibleText(WebDriver driver, String ObjName,String selection) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{
				Select slct = new Select(driver.findElement(locatorRepo.getElementRef(ObjName)));
				
				List<WebElement> options = slct.getOptions();
				int duplicacy = 0;
				
				for(WebElement option : options)
				{
					if(option.getText().equals(selection))
					{
						duplicacy = duplicacy++;
					}
				}
				
				if(duplicacy>1)
				{
					logwriter.error(duplicacy +" - options found with visible text - " + selection);
				}
				else
				{
					slct.deselectByVisibleText(selection);
				}
			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void moveOverElement(WebDriver driver, String ObjName) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{


			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void sendKeyStrokes(WebDriver driver, String ObjName, String... KeyStrokes) 
	{


		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 

			if (ele!=null)
			{


			}
			else
			{
				logwriter.error("Object :" + ObjName + " not available on screen");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}
	}

	public static void selectCellWithText(WebDriver driver,String ObjName, String text)
	{

		String locatorProp =locatorRepo.getLocatorproperties(ObjName);
		String[] LocatorDesc = locatorProp.split(Pattern.quote("|"));		

		String tableBaseXpath = LocatorDesc[1];


		List <WebElement> rows = driver.findElements(By.xpath(tableBaseXpath + "/tbody/tr/td[1]"));
		int itemColumn = utils.getColumnWithText(driver,"City", tableBaseXpath);
		int actionColumn = utils.getColumnWithText(driver,"...", tableBaseXpath);

		System.out.println(actionColumn);


		for (int i = 1; i<=rows.size(); i++)
		{

			WebElement ele = driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(itemColumn-1)+"]"));
			if (ele.getText().equals("Mecca"))
			{
				ele = driver.findElement(By.xpath(tableBaseXpath+"/tbody/tr["+i+"]/td["+(actionColumn-2)+"]/a[1]"));
				ele.click();
			}
			System.out.println("");

		}

		driver.close();




	}

	public static void validateRowWithText(WebDriver driver,String ObjName, String... text) 
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(getElementRef(ObjName))); 



			try {
				//				WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 
				WebElement ele = driver.findElement(locatorRepo.getElementRef(ObjName));
				ele.clear();
				ele.sendKeys(text);
				logwriter.info("Object - " + ObjName+ " clicked");
			} catch (NoSuchElementException e) {
				//				e.printStackTrace();
				logwriter.error("Object :" + ObjName + " not available on screen");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ReportException.reportExceptionToExtentReport(e);
		}




	}

}


