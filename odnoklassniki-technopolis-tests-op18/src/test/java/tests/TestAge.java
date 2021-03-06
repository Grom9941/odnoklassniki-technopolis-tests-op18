package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestAge extends TestBase{

    @Test
    public void testCase() {
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot "));

        new UserMainPage(driver).clickMySettings();
        MainPageSettings setting = new MainPageSettings(driver);
        setting.clickPublic();
        setting.clickChecked();
        setting.clickSave();

        new UserMainPage(driver).clickBlockQuit();
        MainPageExit quit = new MainPageExit(driver);
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot"));
        MainPageAdditional additional = new MainPageAdditional(driver);

        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));
        additional.clickAccount().search();

        Assert.assertEquals(new Return(driver).textAge().split(" ").length,2);
    }

    @After
    public void after() {
        init1();
        new SessionHelper(driver1).doLogin(new TestBot("QA18testbot17", "QA18testbot "));

        MainPageAdditional additional = new MainPageAdditional(driver1);
        additional.clickUserMain();
        new UserMainPage(driver1).clickMySettings();

        MainPageSettings setting = new MainPageSettings(driver1);
        setting.clickPublic();
        setting.clickChecked3();
        setting.clickSave();

        Assert.assertTrue(new Return(driver1).checkedSelected1());
        stop1();
    }

}
