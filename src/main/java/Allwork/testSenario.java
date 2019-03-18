
package Allwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Russe
 *
 */
public class testSenario {
	
	WebDriver driver;
	
	public testSenario (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void Hover() 
	{
		WebElement toElement= driver.findElement(By.xpath(".//*[@id='csstyle']/div[2]/header/nav/ul/li[1]/a"));
		Actions x = new Actions(driver);
		x.moveToElement(toElement);
		x.perform();
		WebElement d = driver.findElement(By.xpath("//body[@id='csstyle']/div[2]/header/nav/ul/li[1]/div/div/div[2]/div/ul/li[1]/a"));
		d.click();
		x.perform();
		
		
		WebElement source = driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/input"));
		x.click();
		x.dragAndDropBy(source, 16, 01);
		x.perform();
		
		WebElement dd = driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input"));
		dd.clear();
		dd.sendKeys("120000");
		
		
		WebElement source1 = driver.findElement(By.xpath(".//*[@id='text36']"));
		source1.click();
		driver.findElement(By.xpath(".//*[@id='text36']/option[3]"));
		source1.click();
	
		
		WebElement pp = driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/input"));
		pp.clear();
		pp.sendKeys("3.5");
		
		WebElement gg = driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[2]/div/div[4]/div/div/div[1]/article/div/div[2]/a"));
		gg.click();
		
		String kk= driver.findElement(By.xpath(".//*[@id='mortgage-rate-table-app']/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/div/div/span")).getText();
		String f =kk.replaceAll("\\$", "");
		String u=f.replaceAll("\\,", "");
		double r = Double.parseDouble(u);
		
		if(r >= 2500) 
		{
			System.out.println("it is more than 2500");
		}
		
		else {
			System.out.println("it is less than 2500");
		}
		
	}

}
