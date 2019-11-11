package UILibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverSetup {

	
	public static WebDriver driver;
	
	

	public static WebDriver setupBrowserDriver(String browser)
	{
		
		
		if (browser.equals("FireFox") )
		{
//			System.out.println(System.getProperty("user.dir") +"\\WebDriversEXE\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin","C:\\Users\\ankapur\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\WebDriversEXE\\geckodriver.exe");
			 driver =new FirefoxDriver();
		}
		else if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\WebDriversEXE\\chromedriver.exe");
//			driver.set(new ChromeDriver());
			// Initialize browser
			 driver=new ChromeDriver();
		}
		else if (browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"\\WebDriversEXE\\IEDriverServer.exe");
			 
			// Initialize browser
			 driver=new InternetExplorerDriver();
		}
		else 
		{
			//set it up for IE
		}
		
		
		return driver;
		
	}
}

