package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


    public class MouseHoverActions {
        private WebDriver driver;
        private String baseUrl;
        JavascriptExecutor jse;

        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumJars\\Firefox and Gecko\\geckodriver.exe");
            driver = new FirefoxDriver();
            baseUrl = "https://letskodeit.teachable.com/pages/practice";
            jse = (JavascriptExecutor)driver;

            // Maximize the browser's window
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

        @Test()
        public void testMouseHoverActions() throws Exception {
            driver.get(baseUrl);
            jse.executeScript("window.scrollBy(0, 600)");
            Thread.sleep(2000);

            WebElement mainElement = driver.findElement(By.id("mousehover"));

            Actions actions = new Actions(driver);

            actions.moveToElement(mainElement).perform();
            Thread.sleep(2000);

            WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));

            actions.moveToElement(subElement).click().build().perform();
        }

        @After
        public void tearDown() throws Exception {
            Thread.sleep(2000);
            driver.quit();
        }
}


