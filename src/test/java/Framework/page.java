package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class page {

	//page object
	public static WebDriver driver;
	
	public static void openBrowser()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
	
	public static void GotoURL(String url)
	
	{
		driver.get("https://www.facebook.com/");
	}
	
	public static void printTitle()
	
	{
		String Title = driver.getTitle();
    	System.out.println(Title);
    String Expected_Title =  "Facebook – log in or sign up";
    if(Expected_Title.equalsIgnoreCase(Title)) 
    {
    	System.out.println("Title is captured correctly");
    }
   	
    else
    {
    	
      System.out.println("Title does not match");	
	 }
    
	}
	
	public static void enterUsename()
	
	{
		WebElement Emailfield = driver.findElement(By.id("email"));
	    Emailfield.sendKeys("testing@gmail.com");
	}
	
	public static void enterPassword()
	
	{
		WebElement passwordfield = driver.findElement(By.name("pass"));
	    passwordfield.sendKeys("sumit@123");
	}
	
	
	public static void ClickLoginButton()
	
	{
	
		WebElement LoginButton = driver.findElement(By.name("Login"));
	    LoginButton.click();
	}
		
	
	
	}
	
	
	
	
	
	
	
	

