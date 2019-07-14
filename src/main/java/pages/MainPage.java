package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//em[text()='muhammadFawzy']")
    public WebElement enteredUsrName;
    @FindBy(xpath = "html/body/div[1]/header/div/div[2]/div[2]/a[2]")
    private WebElement signUpBtn;
    @FindBy(xpath = "//a[text()='Users']")
    public WebElement usersSrchType;
    @FindBy(name = "q")
    private WebElement searchGithub;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickSignupBtn() {
        signUpBtn.click();
    }

    public void enterUsrName(String usrName) {
        searchGithub.sendKeys(usrName);
        searchGithub.sendKeys(Keys.ENTER);
    }

    public void clickOnUsersSrchType() {
        usersSrchType.click();
    }
}
