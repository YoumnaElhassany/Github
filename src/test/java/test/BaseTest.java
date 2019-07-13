package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://github.com");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToInitialUrl() {
        driver.navigate().to("https://github.com");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}