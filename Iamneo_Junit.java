package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iamneo_Junit {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		driver.close();
	}

	@Test
	public void test1() {
		System.out.println("Test1");
		driver.get("https://www.google.co.in/");
	     driver.manage().window().maximize();
	     driver.navigate().to("http://iamneo.ai");
	     //Write a method to print PASS if the title of the page matches with “We are Hiring!” else FAIL. (If you are familiar with TestNG or JUnit use assert statements like assert equals(actual, expected) to give a verdict of the pass or fail status.
	     String expected="We are Hiring";
	     String actual=driver.getTitle();
	     if(expected.equalsIgnoreCase(actual))
	     {
	    	 System.out.println("Pass");
	     }
	    	 else {
	    		 System.out.println("Fail");
	    	 }
	    		 
	   //  Assert.assertEquals(expected, actual);
//	     driver.navigate().to("http://www.facebook.com");
//	     driver.navigate().back();
//	     String strUrl=driver.getCurrentUrl();
//	     System.out.println(strUrl);
//	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
//	     driver.navigate().forward();
//	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
//	     driver.navigate().refresh();
//	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
	}
	@Test
	public void test2() {
		System.out.println("Test2");
		driver.navigate().to("http://www.facebook.com");
	     driver.navigate().back();
	     String strUrl=driver.getCurrentUrl();
	     System.out.println(strUrl);
	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	     driver.navigate().forward();
	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	     driver.navigate().refresh();
	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}


}