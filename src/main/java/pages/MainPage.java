package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "html/body/div[1]/header/div/div[2]/div[2]/a[2]")
    private WebElement signUpBtn;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickSignupBtn() {
        signUpBtn.click();
    }
}
