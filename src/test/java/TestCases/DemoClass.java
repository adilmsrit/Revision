package TestCases;

import Utilities.GenericMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoClass {

  private WebDriver driver;
  private String baseUrl;
  private GenericMethods gm;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://94.200.29.187:5005/emarapayGateway/jsf/user/login.do";
    gm = new GenericMethods(driver);

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test()
  public void test() throws Exception {
    driver.get(baseUrl);

    WebElement emailField = gm.waitForElement(By.name("username"), 3);
    emailField.sendKeys("DW300109");
    WebElement password = gm.waitForElement(By.name("password"), 5);
    password.sendKeys("P@ss1234");
    WebElement Login = gm.waitForElement(By.id("loginbtn"), 3);
    Login.click();
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
  }
}
