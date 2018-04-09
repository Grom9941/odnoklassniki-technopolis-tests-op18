package tests;

import core.*;
import model.TestBot;
import org.junit.Test;
//import org.openqa.selenium.By;

//import static org.junit.Assert.fail;

public class SecondTest extends TestBase{

    @Test
    public void testCase() throws Exception {
        new SessionHelper(driver).doLogin(new TestBot("technopolisbot", "technopolis16"));
        new UserMainPageHelper(driver).clickMySettings();
        MainPageSettings setting = new MainPageSettings(driver);
        setting.clickPublic();
        setting.clickChecked();
//        setting.clickSave();
        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();
        new SessionHelper(driver).doLogin(new TestBot("technopolisbot", "technopolis16"));
        MainPageFriend friend = new MainPageFriend(driver);
        friend.clickFriend();
        friend.clickAccount();
    //    String str = By.xpath("//div[@data-type='AGE']//text()").toString();
    //    if (!str.equals("2")) {
    //        return;
    //    }
    }

}
