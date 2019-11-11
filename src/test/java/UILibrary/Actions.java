package UILibrary;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.locatorRepo;
import Utilities.utils;




public class Actions {

	WebElement element;

	private static final Logger logwriter = LogManager.getLogger(Actions.class);

	
//	public static void click(WebDriver driver,String ObjName)
//	{
//		WebDriverWait wait = new WebDriverWait(driver,20);
////		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(getElementRef(ObjName))); 
//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 
//
//		if (ele!=null)
//		{
//			ele.click();
//			logwriter.info("Object - " + ObjName+ " clicked");
//		}
//		else
//		{
//			logwriter.error("Object :" + ObjName + " not available on screen");
//		}
//		
//
//		
//	}
	
	public static void click(WebDriver driver,String ObjName)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(getElementRef(ObjName))); 

		
	
			try {
//				WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorRepo.getElementRef(ObjName))); 
				WebElement ele = driver.findElement(locatorRepo.getElementRef(ObjName));
				ele.click();
				logwriter.info("Object - " + ObjName+ " clicked");
			} catch (NoSuchElementException e) {
//				e.printStackTrace();
				logwriter.error("Object :" + ObjName + " not available on screen");

			}
		
		

		
	}
	
	public static void sendKeys(WebDriver driver,String ObjName, String text)
	{
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
		
		

		
	}
	
	public static void getURL(WebDriver driver,String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		logwriter.info("Browser with URL : " +url + " opened");
				
		
	}
	//**************************************************************************************************************************************
	// Utility functions
	
//	public static String getLocatorproperties(String locatorName)
//	{
//		Properties OR = null;
//		
//		String locatorProperty = null;
//		String OrFile= "ObjectRepository//OR.properties";
//		BufferedReader reader;
//		
//		
//		 
//		 try {
//			reader = new BufferedReader(new FileReader(OrFile));
//			
//			OR = new Properties();
//			try {
//				OR.load(reader);
//				reader.close();
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		 locatorProperty = OR.getProperty(locatorName);
//		 
//		return locatorProperty;
//		
//	}
//	
//	public static By getElementRef(String ObjName)
//	{
//		String[] LocatorDesc;
//		By ByRef = null;
//		
//		String Locatorprop = getLocatorproperties(ObjName);
//		LocatorDesc = Locatorprop.split(Pattern.quote("|"));		
//		
//		Locators loc = Locators.valueOf(LocatorDesc[0].trim().toUpperCase());
//
//		
//		
//		switch (loc) {  
//		 case XPATH :  
//		     ByRef = By.xpath(LocatorDesc[1].trim());
//		   break;  
//		case CSSSELECTOR:  
//			ByRef = By.cssSelector(LocatorDesc[1].trim());
//		   break;
//		case ID:  
//			ByRef = By.id(LocatorDesc[1].trim());
//		   break; 
//		case NAME:  
//			ByRef = By.name(LocatorDesc[1].trim());
//		   break;
//		case LINKTEXT:  
//			ByRef = By.linkText(LocatorDesc[1].trim());
//		   break; 
//		case PARTIALLINKTEXT:  
//			ByRef = By.partialLinkText(LocatorDesc[1].trim());
//		   break; 
//		 
//		 default:  
//		     System.out.println("Locator Type given is wrong for locator :" + LocatorDesc[1].trim() );  
//		 } 
//		
//		
//		return ByRef;
//	}

	}


