package pages.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SignupSetUpPage extends BasePage {

    public SignupSetUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
