package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.Assert;
import org.junit.Test;

public class SecondTest extends TestBase{

    @Test
    public void testCase() {
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot "));
        new UserMainPageHelper(driver).clickMySettings();

        MainPageSettings setting = new MainPageSettings(driver);
        setting.clickPublic();
        setting.clickChecked();
//        setting.clickSave();

        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot"));
        MainPageSearch friend = new MainPageSearch(driver);

        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546738044")).search();
        friend.clickAccount();

        String str = new TextPage(driver).textAge();
        Assert.assertEquals(str.split(" ").length,2);
    }

}
