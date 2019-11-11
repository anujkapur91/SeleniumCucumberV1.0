package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utils {

	public static int getColumnWithText(WebDriver driver,String text, String table)
	{
		List <WebElement> cols = driver.findElements(By.xpath(table+"/thead/tr/th"));
		int i;
		
		for(i =1;i<=cols.size();i++)
		{
			System.out.println(driver.findElement(By.xpath(table+"/thead/tr/th["+i+"]")).getText());
			if(driver.findElement(By.xpath(table+"/thead/tr/th["+i+"]")).getText().equals(text))
			{
//				return i;
				break;
			}
		} 
		return i;
		
	}
}
