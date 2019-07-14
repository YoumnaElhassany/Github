package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static void waitForElementVisible(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        //WebDriverWait wait = new WebDriverWait(webDriver, 60);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementNotVisible(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        Boolean visible = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void waitForElementVisible(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementSelected(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        Boolean bool = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public static void waitForElementSelected(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        Boolean bool = wait.until(ExpectedConditions.elementToBeSelected(webElement));
    }

    public static void waitForElementClickable(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementClickable(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 120);
        webElement = wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static boolean waitForPageTitle(WebDriver webDriver, String title) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        return wait.until(ExpectedConditions.titleContains(title));
    }
}
