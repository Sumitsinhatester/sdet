package Framework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterData extends page {

	@Test
	public static void test2()
	
    {
		openBrowser();
    	
    	
		GotoURL("https://www.facebook.com/");
    	
    	
		printTitle();
		
		
		enterUsename();
    
    
		enterPassword();
    
		ClickLoginButton();
	
	driver.quit();
}
	
}
