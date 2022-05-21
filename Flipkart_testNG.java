package test;

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

public class Flipkart_testNG {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("test1");
  }
  @Test
  public void g() {
	  System.out.println("test2");
	  driver.get("https://flipkart.com");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  for(int i=1;i<=links.size()-1;i++){
	  System.out.println(i +" : "+ links.get(i).getAttribute("href"));
      }
      driver.quit();
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