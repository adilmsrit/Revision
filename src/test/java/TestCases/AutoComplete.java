package TestCases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoComplete {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void setup() throws Exception{
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumJars\\Firefox and Gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.southwest.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAutoComplete() throws Exception{
        driver.get(baseUrl);
        String searchingText = "New York/Newark, NJ - EWR";
        String partialText = "New York";

        driver.findElement(By.id("air-city-departure")).sendKeys(partialText);

        //air-city-departure-menu
        WebElement element = driver.findElement(By.id("air-city-departure-menu"));


    }

}
