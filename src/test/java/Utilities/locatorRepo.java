package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import UILibrary.Locators;

public class locatorRepo {
	
	public static String getLocatorproperties(String locatorName)
	{
		Properties OR = null;
		
		String locatorProperty = null;
		String OrFile= "ObjectRepository//OR.properties";
		BufferedReader reader;
		
		
		 
		 try {
			reader = new BufferedReader(new FileReader(OrFile));
			
			OR = new Properties();
			try {
				OR.load(reader);
				reader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 locatorProperty = OR.getProperty(locatorName);
		 
		return locatorProperty;
		
	}
	
	public static By getElementRef(String ObjName)
	{
		String[] LocatorDesc;
		By ByRef = null;
		
		String Locatorprop = getLocatorproperties(ObjName);
		LocatorDesc = Locatorprop.split(Pattern.quote("|"));		
		
		Locators loc = Locators.valueOf(LocatorDesc[0].trim().toUpperCase());

		
		
		switch (loc) {  
		 case XPATH :  
		     ByRef = By.xpath(LocatorDesc[1].trim());
		   break;  
		case CSSSELECTOR:  
			ByRef = By.cssSelector(LocatorDesc[1].trim());
		   break;
		case ID:  
			ByRef = By.id(LocatorDesc[1].trim());
		   break; 
		case NAME:  
			ByRef = By.name(LocatorDesc[1].trim());
		   break;
		case LINKTEXT:  
			ByRef = By.linkText(LocatorDesc[1].trim());
		   break; 
		case PARTIALLINKTEXT:  
			ByRef = By.partialLinkText(LocatorDesc[1].trim());
		   break; 
		 
		 default:  
		     System.out.println("Locator Type given is wrong for locator :" + LocatorDesc[1].trim() );  
		 } 
		
		
		return ByRef;
	}

}
