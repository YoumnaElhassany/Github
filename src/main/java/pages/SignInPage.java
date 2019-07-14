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
    @FindBy(xpath = "//*[@id=\"js-flash-container\"]/div/div")
    public WebElement incorrectToasterTxt;
    @FindBy(id = "login_field")
    private WebElement usrLoginField;
    @FindBy(id = "password")
    private WebElement usrPasswordField;
    @FindBy(name = "commit")
    private WebElement signInBtn;
    @FindBy(xpath = "//*[@id=\"account-switcher-left\"]/summary/span")
    public WebElement usrNameDropDownList;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }

    public void sendSignInData(String usrName, String passWord) {
        usrLoginField.sendKeys(usrName);
        usrPasswordField.sendKeys(passWord);
        signInBtn.click();
    }
}
