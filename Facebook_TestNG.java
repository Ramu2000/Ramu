package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Facebook_TestNG {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("test1");	  
  }
  @SuppressWarnings("deprecation")
@Test
  public void g() {
	  System.out.println("test2");
	  driver.get("https://www.google.co.in/");
	     driver.manage().window().maximize();
	     driver.navigate().to("http://www.fb.com");
	     WebElement create=driver.findElement(By.linkText("Create New Account")); create.click();
//	     create.click();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement Fname=driver.findElement(By.name("firstname"));
	    WebElement surname=driver.findElement(By.name("lastname"));
	    WebElement email=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
	    WebElement reg_enteremail=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
	    WebElement newpassword=driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
	    Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
	     Fname.clear();
	     Fname.sendKeys("Harsha");
	     surname.clear();
	     surname.sendKeys("Lanka");
	     email.sendKeys("lankaharshavardhan007@gmail.com");
	     reg_enteremail.sendKeys("lankaharshavardhan007@gmail.com");
	     newpassword.sendKeys("Ram harsha");
	     selDate.selectByVisibleText("24");
	     selMonth.selectByVisibleText("Dec");
	     selYear.selectByVisibleText("1999");
	     driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			driver.findElement(By.name("websubmit")).click();
	  
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