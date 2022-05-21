package test;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;



public class Flipkart_junit {
      WebDriver driver;
   @Test
     public void f() {
     driver.get("https://flipkart.com");
     List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println(links.size());
      for(int i=1;i<=links.size()-1;i++){
      System.out.println(i +" : "+ links.get(i).getAttribute("href"));
    }
 }
@BeforeMethod
      public void beforeMethod() {
      System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

      driver = new ChromeDriver();
}



@AfterMethod
public void afterMethod() {
driver.close();
}



}