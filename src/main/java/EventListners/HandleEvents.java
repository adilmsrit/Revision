package EventListners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class HandleEvents implements WebDriverEventListener {

    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeAlertAccept");
    }

    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterAlertAccept");
    }

    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterAlertDismiss");
    }

    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeAlertDismiss");
    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeNavigateTo");
    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterNavigateTo");
    }

    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeNavigateBack");
    }

    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterNavigateBack");
    }

    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeNavigateForward");
    }

    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterNavigateForward");
    }

    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeNavigateRefresh");
    }

    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterNavigateRefresh");
    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeFindBy");
    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterFindBy");
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeClickOn");
    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterClickOn");
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Adil Implementation of :  beforeChangeValueOf");
    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Adil Implementation of :  afterChangeValueOf");
    }

    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeScript");
    }

    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterScript");
    }

    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  beforeSwitchToWindow");
    }

    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  afterSwitchToWindow");
    }

    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("Adil Implementation of :  onException");
    }
}
