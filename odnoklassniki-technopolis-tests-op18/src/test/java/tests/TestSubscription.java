package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSubscription extends TestBase {

    @Before
    public void testCaseBefore() throws Exception {
        init1();
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));

        MainPageSearch account18 = new MainPageSearch(driver);
        account18.clickAccount().search();
   //     account18.addFriend();

        new SessionHelper(driver1).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
    //    new MainPageSearch(driver1).clickAccept();
    }

    @Test
    public void testCase() throws Exception {

        MainPageSettings setting = new MainPageSettings(driver1);
        setting.clickMySettings();
        setting.clickPublic();
        setting.clickChecked1();
//        setting.clickSave();

        new MainPageSearch(driver).clickHisFriend();
        Assert.assertFalse(new TextPage(driver).testSubscription());
    }

    @After
    public void testCaseAfter() throws Exception {
        stop1();
    }

}
