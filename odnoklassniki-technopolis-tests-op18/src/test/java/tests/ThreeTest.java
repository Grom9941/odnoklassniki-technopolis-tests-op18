package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.Before;
import org.junit.Test;

public class ThreeTest extends TestBase {

    @Before
    public void testCase1() throws Exception {
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));

        MainPageSearch friend = new MainPageSearch(driver);
        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546738044"));
        friend.clickAccount();
        friend.addFriend();
    }

    @Test
    public void testCase() throws Exception {

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot "));
        new UserMainPageHelper(driver).clickMySettings();

        MainPageSettings setting = new MainPageSettings(driver);
        setting.clickPublic();
        setting.clickChecked1();
//        setting.clickSave();

        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot"));
        MainPageSearch friend = new MainPageSearch(driver);

        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546738044"));
        friend.clickAccount();
    }


}
