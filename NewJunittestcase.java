package test;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class NewJunittestcase {

	WebDriver driver ;
    //BeforeClass annotation--method is will execute before the initiation if class 
    /*@BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setupBeforeClass");
    }
    //AfterClass annotation--method is will execute After the  class done its job
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Teardownafterclass");
    }*/
    //Before annotation--method is will execute before completeing each test method
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","" )
        // 1.Open the browser
        driver = new ChromeDriver();
    }
    //After annotation--method is will execute after completeing each test method
    @After
    public void tearDown() throws Exception {
        System.out.println("TearDown");
        driver.close();
    }
 
    @Test
    public void test() {
        WebDriverWait wait=new WebDriverWait(driver,1000);
        FluentWait  waitt = new FluentWait(driver);
        waitt.withTimeout(Duration.ofSeconds(300));
        waitt.pollingEvery(Duration.ofSeconds(30));


        System.out.println("Test1");
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        WebElement title_Login=driver.findElement(By.id("logInPanelHeading"));
        //Name of the text
        System.out.println(title_Login.getText());
        //Print Tag name
        System.out.println(title_Login.getTagName());
        WebElement uname=driver.findElement(By.id("txtUsername"));
        WebElement pwd=driver.findElement(By.id("txtPassword"));
        uname.clear();
        uname.sendKeys("Admin");
        pwd.clear();
        pwd.sendKeys("admin123");
        WebElement loginBtn=driver.findElement(By.name("Submit"));
        //WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        /*String expectedResult="https://opensource-demo.orangehrmlive.com/index.php/Home.php";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(expectedResult, actualResult);*/
        String exp="Welcome";
        String actual=driver.findElement(By.id("welcome")).getText();
        //System.out.println("Hello My Team..Welcome to my class".contains("My"));
        //System.out.println("Hello My Team..Welcome to my class".contains("Enjoy"));
        Assert.assertTrue(actual.contains(exp));
        //FindElement will find the first matched element[returning a single element]
        //driver.findElement(By.className("firstLevelMenu")).click();
        //Find Elements will bring all the matched elements
        List<WebElement> eleemntlist=driver.findElements(By.className("firstLevelMenu"));
        System.out.println(eleemntlist.size());
        eleemntlist.get(3).click();



        driver.findElement(By.linkText("Admin")).click();
        //WebElement adminlink=driver.findElement(By.linkText("Admin"));
        //adminlink.click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Ashwin");
        Select role=new Select(driver.findElement(By.id("searchSystemUser_userType")));
        role.selectByVisibleText("Admin");
        //role.selectByValue("1");
        //role.selectByIndex(1);
        driver.findElement(By.name("_search")).click();
        driver.findElement(By.id("welcome")).click();
        //implicitlyWait
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
        //explicitWait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        //FluentWait
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();

    }
    //Test annotation--method is for test purpose
    @Test
    public void test1() {
        System.out.println("Test2");
        driver.get("https://www.google.co.in/");
        //navigation Commands
        //1.TO Maximize the screen
        driver.manage().window().maximize();
        //2.To refresh the page
        driver.navigate().refresh();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //3.To go back to the history page
        driver.navigate().back();
        //4.To forward 
        driver.navigate().forward();
        //5.Load new URL
        driver.navigate().to("https://www.google.co.in/");
    }
 
}
