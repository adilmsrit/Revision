package TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {
  String baseURL;
  private WebDriver driver;
  private JavascriptExecutor js;

  @Before
  public void setup() throws Exception {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
    driver = new ChromeDriver();

    baseURL = "https://letskodeit.teachable.com/pages/practice";

    js = (JavascriptExecutor) driver;

  }

  @Test
  public void testJavaScriptExecutor() throws Exception {
    js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
    Thread.sleep(2000);

  }

}
