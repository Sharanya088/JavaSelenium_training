package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Flipkart_10 {
	WebDriver driver;
  @Test
  public void f() {
	  
      driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://flipkart.com"); 
	    driver.findElement(By.xpath("//div//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9741007306"); 
  	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nanduking");		
		driver.findElement(By.xpath("//div//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();	  
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
	  System.out.println("Before method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}