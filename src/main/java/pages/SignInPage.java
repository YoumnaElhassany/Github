package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Sign in to GitHub']")
    public WebElement loginHeadline;
    @FindBy(xpath = "//a[contains(@href, '/login')]")
    private WebElement loginBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }
}
