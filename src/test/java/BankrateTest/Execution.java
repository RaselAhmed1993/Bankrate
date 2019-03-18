/**
 * 
 */
package BankrateTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Allwork.testSenario;

/**
 * @author Russe
 *
 */
public class Execution extends BrowserNavigation{
	
	
	
	@Test
	public void execution() throws InterruptedException 
	
	{
		
		testSenario v= new testSenario(driver);
		v.Hover();
		
	}

}
