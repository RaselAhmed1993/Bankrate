/**
 * 
 */
package BankrateTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Russe
 *
 */
public class BrowserNavigation {
	WebDriver driver;

	
	
	
	@Before
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Russe\\OneDrive\\Desktop\\Bittech\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankrate.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	
	}
	}
	
	


