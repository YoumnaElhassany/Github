package pages.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SignupExperiencePage extends BasePage {
    public SignupExperiencePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
