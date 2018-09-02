package TestCases.ITestResultDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGITestResultsDemo {

    @Test
    public void testMethod1(){
        System.out.println("Running --> testMethod1");
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod2(){
        System.out.println("Running --> testMethod2");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult){
        System.out.println("From the AfterMethod : "+testResult.getMethod().getMethodName());

    }

}
