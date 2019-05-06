package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setup() throws Exception {
    System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumJars\\Firefox and Gecko\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://letskodeit.teachable.com/pages/practice";
    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

  @Test
  public void test() throws Exception {
    //Get the parent handle.
    String parentHandle = driver.getWindowHandle();
    System.out.println("Parent Handle: " + parentHandle);

    //Find the open Window button.
    WebElement openWindow = driver.findElement(By.id("openwindow"));
    openWindow.click();

    //Get all Handles
    // We can use List also, and since Set only keeps uniqueue things we will use only Set.
    Set<String> allHandles = driver.getWindowHandles();

    for (String handle : allHandles) {
      if (!handle.equals(parentHandle)) {
        driver.switchTo().window(handle);
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");
        Thread.sleep(2000);
        driver.close();
        break;
      }
      // Switch back to the parent window
      driver.switchTo().window(parentHandle);
      Thread.sleep(2000);
      driver.findElement(By.id("name")).sendKeys("Test Successful");
    }
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
  }
}
