package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SignInPage;

public class SignInPageTests extends BaseTest {

    @DataProvider
    private Object[][] invalidCredentials() {
        return new Object[][]{
                //wrong usrName and wrong password
                {"test1234", "12345678Test#"},
                //empty password
                {"test1234", " "},
                //correct email and wrong password
                {"test@gmail.com", "testTest.123"},
                //empty usrName and correct password
                {" ", "testTest.123@1"}};
    }

    @Test
    public void assertOnLoginPageHeadline() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickOnLoginBtn();

        Assert.assertEquals(signInPage.loginHeadline.getText(), "Sign in to GitHub");
    }

    @Test(dataProvider = "invalidCredentials")
    public void invalidLogin(String usrName, String passWord) {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickOnLoginBtn();
        signInPage.sendSignInData(usrName, passWord);

        Assert.assertEquals(signInPage.incorrectToasterTxt.getText(), "Incorrect username or password.");
    }
}


