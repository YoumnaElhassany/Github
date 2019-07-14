package pages.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SignupSubscriptionPage extends BasePage {
    public SignupSubscriptionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
}
