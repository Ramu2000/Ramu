
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
 
public class FrameHandling {
    WebDriver driver;
  @Test(priority=1)
  public void f() {
      driver.get("https://demoqa.com/frames");
      //Switch to the frame
      //1.Use the iframe id or name
      //driver.switchTo().frame("frame1");
      //2.Use the iframe switching using the WEbElement
     // WebElement fram=driver.findElement(By.id("frame1"));
      //driver.switchTo().frame(fram);
      //3.Switching Frame using the index
      driver.switchTo().frame(2);
      String val=driver.findElement(By.id("sampleHeading")).getText();
      System.out.println(val);
      //Switch back from the the Frame to outside
      driver.switchTo().defaultContent();
      System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe')]")).getText());
  }
  @Test(priority=3,enabled=false)
  public void alertHandle()
  {
      driver.get("https://demo.guru99.com/test/delete_customer.php");
      //driver.findElement(By.name("cusid")).sendKeys("101");
      ((JavascriptExecutor)driver).executeScript("document.getElementsByName('cusid')[0].value='101';");
      driver.findElement(By.name("submit")).click();
      //print the information which is present in the alert box
      String info=driver.switchTo().alert().getText();
      System.out.println(info);
      //Click OK on alertBOX
      driver.switchTo().alert().accept();
      //Click Cancel on alertBox
     // driver.switchTo().alert().dismiss();
      //Type on the alertbox
      //driver.switchTo().alert().sendKeys("Hello");
 
  }
  @Test(priority=2)
  public void jsExecute()
  {
      driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
      ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,5500);");
  }
  @BeforeMethod
  public void beforeMethod() {
      System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","" )
        // 1.Open the browser
        driver = new ChromeDriver();

  }
 
  @AfterMethod
  public void afterMethod() {
      driver.close();
  }
 
}