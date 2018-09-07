package TestCases.ITestResultDemo;

import listnerPackage.IInvokeMethodListner;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

//@Listeners(IInvokeMethodListner.class)
//@Listeners(ITestListener.class)
public class TestNGITestResultsDemo {

    @BeforeClass
    public void setup() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs before the class", true);
    }

    @AfterClass
    public void cleanup() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs after the class", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs before the method", true);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed:- " + testResult.getMethod().getMethodName());
        }
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Passed:- " + testResult.getMethod().getMethodName());
        }
    }

    @Test
    public void testMethod1() {
        System.out.println("Running --> testMethod1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "testMethod1")
    public void testMethod2() {
        System.out.println("Running --> testMethod2");
        Assert.assertTrue(true);
    }
}
