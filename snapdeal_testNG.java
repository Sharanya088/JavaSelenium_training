package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class snapdeal_testNG {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Test1");
		driver.get("https://www.google.co.in/");
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.snapdeal.com/");
	     WebElement usr = driver.findElement(By.xpath("//div//span[@class=\"accountUserName col-xs-12 reset-padding\"]"));
	     Actions actions = new Actions(driver);
	     actions.moveToElement(usr); // Call clickAndHold() method to perform click and hold operation. 
	     actions.clickAndHold().perform();
	     driver.findElement(By.xpath("//div//span[@class=\"accountBtn btn rippleWhite\"]")).click(); 
	     driver.switchTo().frame("loginIframe");
	     driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number/ Email\"]")).sendKeys("9741007306");
	     driver.findElement(By.xpath("//div//button[@id=\"checkUser\"]")).click(); 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
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