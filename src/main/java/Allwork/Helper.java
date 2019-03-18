/**
 * 
 */
package Allwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Russe
 *
 */
public class Helper {
	
	WebDriver driver;
	
	
	public Helper (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void Click(WebDriver driver, By by, int index)
	{
	
		driver.findElements(by).get(index).click();
		
	}
	
	public void Typer(WebDriver driver, By by, String value)
	{
		driver.findElement(by).sendKeys(value);
	}

}
