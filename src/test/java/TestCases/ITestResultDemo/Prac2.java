package TestCases.ITestResultDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Prac2 {
  @Test
  public static void method1() {
    System.out.println("Method1");
    Assert.assertTrue(true);

  }

  @Test
  public static void method2() {
    System.out.println("Method2");
    Assert.assertTrue(true);
  }

  @AfterMethod
  public static void afterMethod(ITestResult iTestResult) {
    if (iTestResult.getStatus() == iTestResult.FAILURE) System.out.println("Failed Boss");
    if (iTestResult.getStatus() == iTestResult.SUCCESS) System.out.println("Passed Boss");
  }
}
