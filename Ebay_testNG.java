package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Ebay_testNG {
	WebDriver driver;
  @Test
  public void f() {
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
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}