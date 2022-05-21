package test;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setupbeforeClass");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        
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
		driver.get("https://www.google.co.in/");
	     driver.manage().window().maximize();
	     driver.navigate().to("http://www.fb.com");
	     WebElement create=driver.findElement(By.linkText("Create New Account"));
	     create.click();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement Fname=driver.findElement(By.name("firstname"));
	    WebElement surname=driver.findElement(By.name("lastname"));
	   //  WebElement mble=driver.findElement(By.id("u_j_g_ic"));
	   //  WebElement passw=driver.findElement(By.id("password_step_input"));
	     //dob 
	    // Select dob=new Select(driver.findElement(By.xpath("mtm mbs _2_68")));
	     
	    //  dob.selectByValue("u_j_3_yG");
	    
	      //gender 
	   //  WebElement signup=driver.findElement(By.id("u_j_s_RJ"));
	     Fname.clear();
	     Fname.sendKeys("karthik ");
	     surname.clear();
	     surname.sendKeys("mamidigumpula");
//	    mble.clear();
//	    mble.sendKeys("7995997654");
//	    passw.clear();
//	    passw.sendKeys("Mkrr@123");
//	    signup.clear();
//	    signup.click();*/
	}

}
