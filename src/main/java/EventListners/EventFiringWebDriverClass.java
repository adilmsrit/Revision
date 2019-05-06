package EventListners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class EventFiringWebDriverClass {
  WebDriver driver;

  @Test
  public void testcase() {
    String baseUrl = "http://www.expedia.com";
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
    driver = new ChromeDriver();

    EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);

        /*HandleEvents class implements the WebDriverEventListener interface.

        public class HandleEvents implements WebDriverEventListener {

        public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeAlertAccept");
            }

        public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterAlertAccept");
            } */

    //Create instance of the HandleEvents class.
    HandleEvents handleEvents = new HandleEvents();
    eDriver.register(handleEvents);
    System.out.println("ada");
    eDriver.get(baseUrl);
    eDriver.findElement(By.id("tab-flight-tab-hp")).click();
  }
}
