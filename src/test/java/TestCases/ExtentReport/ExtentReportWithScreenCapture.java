package TestCases.ExtentReport;

import Utilities.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ExtentReportWithScreenCapture {

    private WebDriver driver;
    private String bastUrl;
    ExtentReports extentReport;
    ExtentTest extentTest;
    GenericMethods genericMethods;
    ITestResult iTestResult;


    @BeforeClass
    public void beforeClass() {
        extentReport = new ExtentReports("C:\\Users\\Mohammed.Nazeer\\IdeaProjects\\Revision\\test-output\\ExtentReports\\" + this.getClass().getName() + ".html");
        extentTest = extentReport.startTest("Verify Login Test Adil");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
        driver = new ChromeDriver();

        bastUrl = "https://www.udemy.com/";

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

        System.out.println("In the screen shot directory");

        String filename =   new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()) + "adil.png";
        String directory = "C:\\Users\\Mohammed.Nazeer\\IdeaProjects\\Revision\\test-output\\ExtentReports\\";


        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + filename));
        String destination = directory + filename;
        System.out.println(destination);


        String image = extentTest.addScreenCapture(destination);
        System.out.println("image is "+ image);
        extentTest.log(LogStatus.FAIL, "Failed", image);
        extentReport.endTest(extentTest);
        extentReport.flush();
        Thread.sleep(5000);

        WebElement loginlink =genericMethods.waitForElement(By.xpath("//button[text()='Log In']"));
        loginlink.click();

        WebElement email = genericMethods.waitForElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("adilmsrit@gmail.com");
        extentTest.log(LogStatus.INFO, "Entered email");

        WebElement password = genericMethods.waitForElement(By.id("id_password"));
        password.sendKeys("Camel!234");
        extentTest.log(LogStatus.INFO, "Entered password");
        WebElement login = genericMethods.waitForElement(By.id("submit-id-submit"));
        login.click();
        extentTest.log(LogStatus.PASS, "Entered email");


    }

}
