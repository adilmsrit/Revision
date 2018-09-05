package listnerPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokeMethodListner implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("Before  : - " + iTestResult.getClass().getName()+ iTestResult.getMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("After  : - " + iTestResult.getClass().getName()+ iTestResult.getMethod().getMethodName());
    }
}
