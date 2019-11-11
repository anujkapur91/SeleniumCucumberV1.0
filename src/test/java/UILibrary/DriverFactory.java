package UILibrary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
	String Browsername;
	private static final Logger logwriter = LogManager.getLogger(Actions.class);

	

   private DriverFactory()
   {
      //Do-nothing..Do not allow to initialize this class from outside
   }
   
   private static DriverFactory instance = new DriverFactory();

   public static DriverFactory getInstance()
   {
      return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
   
	{
      @Override
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
//    		  ChromeOptions options = new ChromeOptions();  
//    		  options.addArguments("--headless", "--disable-gpu", "--window-size=0,0","--ignore-certificate-errors");  
//  			driver.set(new ChromeDriver());
  			// Initialize browser
  			 return new ChromeDriver();
    	  }
    	  else
    	  {
    		  logwriter.error("The Browser name not spelled correctly"); 
    		  return null;
    	  }
    	
      }
   };

   public WebDriver getDriver(String s) // call this method to get the driver object and launch the browser
   {
	   Browsername = s;
	   Browsername=Browsername.toUpperCase();
      return driver.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
	   
      driver.get().quit();
      driver.remove();
   }
}
