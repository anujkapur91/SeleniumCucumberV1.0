package Utilities;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import stepDefinations.StepDef;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.core.util.datetime.FastDateFormat;

public class screenshots 
{
	static String screenShotname = null;
	
	
	
	// create a function which takes sreenshot at relative path and returns path
	
	public static String captureScreenShot(WebDriver driver, String Name) 
	{
        String path = null;
        Date myDate = new Date();
    	FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd:HH-mm-ss");
    	String myDateString = fdf.format(myDate);
        myDateString = myDateString.replace(" ", "");
        myDateString = myDateString.replace("-", "");
        myDateString = myDateString.replace(":", "");
        
        screenShotname = myDateString +"_"+StepDef.PageName + Name;
        
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        String dest = "/cucumbertrials/test-output"+screenShotname+".jpeg";
        File target = new File(dest);
        try {
			FileUtils.copyFile(SrcFile, target);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		return path;
    }

}
