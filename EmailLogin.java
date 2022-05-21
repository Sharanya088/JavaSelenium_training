package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EmailLogin {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("http://mail.google.com");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElement(By.name("identifier")).sendKeys("bondugulasharanya7@gmail.com");
	  driver.findElement(By.id("identifierNext")).click();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  driver.findElement(By.cssSelector("#passwd")).sendKeys("Sharanya@088");
	  driver.findElement(By.cssSelector("#signIn")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	  driver.close();
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
