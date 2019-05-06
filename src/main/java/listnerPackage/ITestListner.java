package listnerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListner implements ITestListener {
  public void onTestStart(ITestResult iTestResult) {
    System.out.println("When Test Starts");
  }

  public void onTestSuccess(ITestResult iTestResult) {
    System.out.println("Test Passed");
  }

  public void onTestFailure(ITestResult iTestResult) {
    System.out.println("Test Failed");
  }

  public void onTestSkipped(ITestResult iTestResult) {
    System.out.println("Test Skipped");
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    System.out.println("Test TestFailedButWithinSuccessPercentage");
  }

  public void onStart(ITestContext iTestContext) {
    System.out.println("onStart");
  }

  public void onFinish(ITestContext iTestContext) {
    System.out.println("onFinish");
  }
}
