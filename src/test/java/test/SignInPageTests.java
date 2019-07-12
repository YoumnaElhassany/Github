package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class SignInPageTests extends BaseTest {

    @Test
    public void clickOnSignInBtn() {
        SignInPage signIn = new SignInPage(driver);
        signIn.clickOnLoginBtn();

        Assert.assertEquals(signIn.loginHeadline.getText(), "Sign in to GitHub");
    }
}
