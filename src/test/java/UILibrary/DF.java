package UILibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DF extends ThreadLocal<WebDriver>{
	
	private static final Object Browsername = null;

	protected WebDriver initialValue()
	{
		 if(Browsername.equals("FIREFOX"))
   	  {
   		System.setProperty("webdriver.firefox.bin","C:\\Users\\ankapur\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
   		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\WebDriversEXE\\geckodriver.exe");
   	    return new FirefoxDriver(); // can be replaced with other browser drivers  
   	  }
   	  else if(Browsername.equals("CHROME"))
   	  {
   		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\WebDriversEXE\\chromedriver.exe");
// 			driver.set(new ChromeDriver());
 			// Initialize browser
 			 return new ChromeDriver();
   	  }
   	  else
   	  {
//   		  logwriter.error("The Browser name not spelled correctly"); 
   		  return null;
   	  }
   	
     }		
	}


