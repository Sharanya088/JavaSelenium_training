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
import org.openqa.selenium.support.ui.Select;

public class Ebay_junit {
	
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("apple watches");		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);		
		selectCategory.selectByVisibleText("Computers/Tablets & Networking");	
		driver.findElement(By.id("gh-btn")).click();	
		 List<WebElement> results=driver.findElements(By.className("s-item__title"));
	      System.out.println(results.size());
	      for(int i=0;i<results.size();i++)
	      {
	          System.out.println(results.get(i).getText());	
		}
	}
		
	}