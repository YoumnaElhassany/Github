package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.WaitUtils;


public class MainPageTests extends BaseTest {

    @Test
    public void searchGithubForUsers() {
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsrName("muhammadFawzy");
        mainPage.clickOnUsersSrchType();
        WaitUtils.waitForElementVisible(driver, mainPage.enteredUsrName);

        Assert.assertEquals(mainPage.enteredUsrName.getText(), "muhammadFawzy");
    }

}
