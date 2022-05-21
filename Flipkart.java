package test;

import static org.junit.Assert.*;

import java.util.List;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator; 

public class Flipkart {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setupbeforeClass");
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Teardown After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TearDown");
	}

	@Test
	public void test() {
		System.out.println("Test1");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
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


	}


