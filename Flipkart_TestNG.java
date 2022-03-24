package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Flipkart_TestNG {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("test1");
  }
  @Test
  public void g() {
	  System.out.println("test2");
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      
      String url="";
      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
      System.out.println("Total links on the Wb Page: " + allURLs.size());

      //We will iterate through the list and will check the elements in the list.
      Iterator<WebElement> iterator = allURLs.iterator();
      while (iterator.hasNext()) {
    	  url = iterator.next().getText();
    	  System.out.println(url);
      }
      driver.quit();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	  driver.quit();
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