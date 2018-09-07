package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GenericMethods {
    private WebDriver driver;

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type) {
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with id: " + locator);
            return this.driver.findElement(By.id(locator));
        } else if (type.equals("xpath")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElement(By.xpath(locator));
        } else if (type.equals("css")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElement(By.cssSelector(locator));
        } else if (type.equals("linktext")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElement(By.linkText(locator));
        } else if (type.equals("partiallinktext")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElement(By.partialLinkText(locator));
        } else {
            System.out.println("Locator type not supported");
            return null;
        }
    }

    public List<WebElement> getElementList(String locator, String type) {
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with id: " + locator);
            return this.driver.findElements(By.id(locator));
        } else if (type.equals("xpath")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElements(By.xpath(locator));
        } else if (type.equals("css")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElements(By.cssSelector(locator));
        } else if (type.equals("linktext")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElements(By.linkText(locator));
        } else if (type.equals("partiallinktext")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElements(By.partialLinkText(locator));
        } else {
            System.out.println("Locator type not supported");
            return null;
        }
    }

    public boolean isElementPresent(String locator, String type) {
        List<WebElement> elementList = getElementList(locator, type);
        int size = elementList.size();
        if (size > 0) return true;
        else return false;
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = null;

        try {
            System.out.println("Waiting for max:: " + timeout + " seconds for element to be available");
            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println("Element not appeared on the web page");
        }
        return element;
    }

    public void clickWhenReady(By locator, int timeout) {

        try {
            WebElement element = null;
            System.out.println("Waiting for max:: " + timeout + " seconds for element to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
            System.out.println("Element clicked on the web page");
        } catch (Exception e) {
            System.out.println("Element not appeared on the web page");
            e.printStackTrace();
        }
    }

    public WebElement waitForElement(By locator) {
        WebElement element = null;

        try {
            WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
            element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.getMessage();
        }
        return element;
    }

    public String screenshot(String filename) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Date date = new Date();
        String currentdate = dateFormat.format(date);

        filename = filename + currentdate + ".png";
        String directory = "/test-output/ScreenShots/";
        String destination = directory + filename;
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + filename));
        return destination;
    }

}
