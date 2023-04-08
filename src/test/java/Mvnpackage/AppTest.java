 package Mvnpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	
	@Test 
	public static void FirstTest() 
	{
		//WebDriver
		//Chrome, firefox, edge
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		//driver.close();
	}	
	    @Test
		public static void test2()
		
	    {
    	
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://www.facebook.com/");
	    	driver.manage().window().maximize();
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
		
		driver.quit();
	}
	    
	    @Test
	    public static void LocatorsExample() 
	    
	    {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        //driver.quit();
	        //driver.manage().window().maximize();
	        //driver.findElement(null)
	        //Locators elements in Selenium Webdriver - Locators
	        // By ID
	        // By name
	        // By class name
	        // By tag name
	        // By link text
	        // By partial link text
	        // By CSS
	        // By XPath
	        
	        WebElement text = driver.findElement(By.className("_8eso"));
	        System.out.println(text.getText());
	        WebElement emailfield = driver.findElement(By.id("email"));
	        emailfield.sendKeys("t.sumitsinha@gmail.com");
	        WebElement passwordField = driver.findElement(By.name("pass"));
	        passwordField.sendKeys("123456");
	        WebElement login_Button = driver.findElement(By.name("login"));
	        login_Button.click();
	        
	        
	        
	    }
	    
	             
	    @Test
	    public static void dropdown() throws InterruptedException{
	    {
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();	
	    	driver.get("https://cruise.easemytrip.com/home");
	    	driver.manage().window().maximize();
	    	Thread.sleep(5000);
	    	WebElement Location = driver.findElement(By.id("location"));
	    	
	    	Select s = new Select(Location);
	    	
	    	s.selectByIndex(8);
	    	
	    	
	    	//driver.quit();
	    	Thread.sleep(5000);
	    	WebElement Month = driver.findElement(By.id("sailMonth"));
	        Select m = new Select(Month);
	        m.selectByIndex(4);
	    	
	    	WebElement Time = driver.findElement(By.id("sailMonth"));
	    	Select T = new Select(Time);
	    	T.selectByIndex(3);	
	    	
	    	WebElement Nights = driver.findElement(By.id("duration"));
	    	Select N = new Select(Nights);
	    	N.selectByIndex(1);
	    	
	    	driver.findElement(By.xpath("//p[@class ='fnt16']")).click();
	    	driver.findElement(By.xpath("//p[@xpath = '1']"));
	    	driver.findElement(By.xpath("//input[@field = 'quantity'][1]")).click();
	    	driver.findElement(By.xpath("//p[@xpath='1']")).click();
	    	
	    	//ask about these xpaths
	    	
	    	WebElement SCL = driver.findElement(By.id("cruiseLine"));
	    	Select CL = new Select(SCL); 
	    	CL.selectByIndex(2);
	    	
	    	driver.findElement(By.xpath("//a[@class = 'srch_btn']")).click();}
	    	//WebElement SE = driver.findElement(By.xpath("//a[@class = 'srch_btn']"));
	    	//Select S = new Select(SE);
	    	//S.selectByVisibleText("Search");
	     	
	       	
	    	
	     //WebElement id = driver.findElement(By.id("fst_5_05/08/2022"));
	    	
	    	//WebElement from = driver.findElement(By.id("FromSector_show"));
	    	//from.click();
	    	//driver.findElement(By.id("spn7")).click();
	    	//WebElement To = driver.findElement(By.id("Editbox13_show"));
	    	//To.click();
	    	//driver.findElement(By.id("spn6")).click();
	    	//WebElement date = driver.findElement(By.id("dvfarecal"));
	    	//date.click();
	    	//driver.findElement(By.id("fiv_0_28/08/2022"));
	    	
	    
	    }
	    	
	    	@Test
	    	public static void WaitsExample() throws Exception{
	    		WebDriverManager.chromedriver().setup();
	    		WebDriver driver = new ChromeDriver();
	    		
	    		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    		
	    		driver.get("https://cruise.easemytrip.com/home");
	    		driver.manage().window().maximize();
	    		
	    		driver.findElement(By.xpath("(//*[contains(text(),Greek Isles Round-Trip Athens: Santorini, Mykonos & Istanbul' )])"));
	    		//select tag
	    		
	    		WebElement Location = driver.findElement(By.className("dropbox"));
	    		Select s = new Select(Location);
	    		s.selectByIndex(8);
	    		
	    		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    		
	    		
	    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropbox")));
	    		s.selectByValue("12: Hawaii");
	    		 Thread.sleep(5000);
	    		
	    		
	    		s.selectByVisibleText("Alaska");
	    		
	    	    		
	    		
	    	}
	    	
	    	@Test	    	
	    	public static void AlertsExample() throws InterruptedException {
	    		
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://demoqa.com/alerts");
	    	
	    	driver.findElement(By.id("promtButton")).click();
	    	driver.switchTo().alert().sendKeys("I want to click ok");
	    	driver.switchTo().alert().accept();
	    	/*
	    	driver.findElement(By.id("alertButton")).click();
	    	Thread.sleep(3000);
	    	driver.switchTo().alert().accept();
	    	
	    	driver.findElement(By.xpath("(//button[contains(text(), 'Click me')])[3]")).click();
	    	Thread.sleep(3000);
	    	String textOnAlert = driver.switchTo().alert().getText();
	    	System.out.println(textOnAlert);
	    	driver.switchTo().alert().dismiss();
	    	*/
	    	
	    	
	    	}
	    	@Test
	    	public static void FormExample() throws InterruptedException{
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.navigate().to("https://demoqa.com/automation-practice-form");
	    	//driver.get("https://demoqa.com/automation-practice-form");
	    	driver.findElement(By.id("firstName")).sendKeys("Sumit");
	    			
	    	driver.findElement(By.id("lastName")).sendKeys("Srivastava");
	    	
	    	WebElement userEmail =  driver.findElement(By.id("userEmail"));
	    	userEmail.sendKeys("sumitsrivastava@gmail.com");
	    	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	    	//do it through Id.
	    	driver.findElement(By.id("userNumber")).sendKeys("1234567899");
	    	Thread.sleep(3000);
	    	//we can insert any character or number through (.sendkeys here), no need to go next line.
	    	
	    	driver.findElement(By.id("dateOfBirthInput")).click();
	    	
	    	WebElement year = driver.findElement(By.xpath("[contains(text(),'2003')]"));
	    	Select s = new Select(year);
	    	Thread.sleep(5000);
	    	s.selectByIndex(2003);
	    	
	    	
	    	
	    	//driver.findElement(By.xpath("[contains(text(),'2003')]")).click();
	    
	    	//driver.findElement(By.xpath("//option[contains(text(),'February')]")).click();
	    	
	    	
	    	}
	    	
	 
	    	@Test
	    	public static void OfficeSite() throws InterruptedException{	
		    	WebDriverManager.chromedriver().setup();
		    	WebDriver driver2 = new ChromeDriver();
		    	driver2.manage().window().maximize();
		    	driver2.get("http://10.68.252.116/eedProcessingPlant/Registration");
	    		
	    		
	    		//driver.get("https://demoqa.com/automation-practice-form");
		    	driver2.findElement(By.id("UserId")).sendKeys("sharma.kalyan");
		    	driver2.findElement(By.id("Password")).sendKeys("kalyan@80");
		    	WebElement dropdown2 = driver2.findElement(By.id("ddlLoginUserType"));
		    		Select D = new Select(dropdown2);
		    		D.selectByIndex(10610);
	    		
	    		
	    	}
	    	
	    	
	    	

	    	
	    	
	    	
	    
	    }
	    	
	    	
	    
	    
	    
	    


	

