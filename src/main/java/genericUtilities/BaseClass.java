package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class prvoides all basic pre-conditions and post conditions of the test script
 * using basic configuration annotations of TESTNG
 * @author Chaitra M
 *
 */
public class BaseClass {
	
	//create object of all utility class - public 
	//public JavaUtility jUtil = new JavaUtility();
	
	
	WebDriver driver;
	
	@BeforeSuite(groups = "SmokeSuite")
	public void bsConfig()
	{
	    System.out.println("Database connection susccessful");	
	}
	
	
	@Parameters("BROWSER")
	@BeforeTest
	//@BeforeClass(alwaysRun = true)
	public void bcConfig(String BROWSER)
	{
	    System.out.println("Launch the browser");	
	   // WebDriver driver = new EdgeDriver();
	    
	    //CROSS BROWSER Execution - Runtime Polymorphism
	    if(BROWSER.equalsIgnoreCase("edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    else if(BROWSER.equalsIgnoreCase("fIREFOX"))
	    {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    }
	    else
	    {
	    	driver = new EdgeDriver();
	    }
	    
	    
	    driver.manage().window().maximize();
	    //browser laucnh
	    //maximise
	    //implicitely wait
	    //load the URL
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig()
	{
		System.out.println("Login to Application successful");
		
		//login to App
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig()
	{
		System.out.println("Logout of App successful");
	}
	
	@AfterTest
	//@AfterClass(alwaysRun = true)
	public void acConfig()
	{	
		driver.quit();
		System.out.println("Close the Browser");
	}
	
	@AfterSuite(alwaysRun = true)
	public void asConfig()
	{
		System.out.println("Database connection closed");
	}
	

}
