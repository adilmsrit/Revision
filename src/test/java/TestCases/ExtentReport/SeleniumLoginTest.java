package TestCases.ExtentReport;

import Utilities.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class SeleniumLoginTest {

    private WebDriver driver;
    private String bastUrl;
    ExtentReports extentReport;
    ExtentTest extentTest;
    GenericMethods genericMethods;


    @BeforeClass
    public void beforeClass() {
        extentReport = new ExtentReports("test-output/ExtentReports/logintest" + this.getClass().getName() + ".html");
        extentTest = extentReport.startTest("Verify Login Test Adil");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
        driver = new ChromeDriver();

        bastUrl = "https://www.emirates.com/account/ae/english/login/login.aspx";

        extentTest.log(LogStatus.INFO, "navigate to URL" + bastUrl);

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        extentTest.log(LogStatus.INFO, "By Adil Browser Maximised");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(bastUrl);
        extentTest.log(LogStatus.INFO, "Opened the URL for free crm");
        genericMethods = new GenericMethods(driver);

    }

    @Test
    public void test1_validLoginTest() throws Exception {

        /*WebElement loginlink =genericMethods.waitForElement(By.xpath("//a[@id='login-nav-link']//span[@class='account-username']"));
        loginlink.click();*/

        WebElement email = genericMethods.waitForElement(By.id("txtMembershipNo"));
        email.sendKeys("adilmsrit@gmail.com");
        extentTest.log(LogStatus.INFO, "Entered email");

        WebElement password = genericMethods.waitForElement(By.id("txtPassword"));
        password.sendKeys("Camel!2345");
        extentTest.log(LogStatus.INFO, "Entered password");
        WebElement login = genericMethods.waitForElement(By.id("btnLogin_LoginWidget"));
        login.click();
        extentTest.log(LogStatus.PASS, "Entered email");
        Assert.assertTrue(false);
        Thread.sleep(5000);

    }

    @AfterMethod
    public void afterMethod(ITestResult iTestResult) {
        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            try {
                String path = genericMethods.screenshot(iTestResult.getMethod().getMethodName());
                String image = extentTest.addScreenCapture(path);
                extentTest.log(LogStatus.FAIL, "Failed", image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        extentReport.endTest(extentTest);
        extentReport.flush();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();

    }
}
