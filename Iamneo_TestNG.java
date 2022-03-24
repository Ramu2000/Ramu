package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Iamneo_TestNG {
	WebDriver driver;
  @Test
  public void f() {
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
	    else 
	    {
	    		 System.out.println("Fail");
	     }
}
  @Test
  public void g() {
	  System.out.println("test2");
	  driver.navigate().to("http://www.facebook.com");
	     driver.navigate().back();
	     String strUrl=driver.getCurrentUrl();
	     System.out.println(strUrl);
	     driver.navigate().forward();
	     driver.navigate().refresh();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}