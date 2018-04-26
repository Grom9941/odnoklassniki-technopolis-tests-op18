package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSubscription extends TestBase {

    @Before
    public void testCaseBefore() {
        init1();
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));

        MainPageSearch account18 = new MainPageSearch(driver);
        account18.clickAccount().search();
        new UserMainPage(driver).addFriend();

        new SessionHelper(driver1).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
        new UserMainPage(driver1).clickAccept();
    }

    @Test
    public void testCase(){

        new UserMainPage(driver1).clickMySettings();
        MainPageSettings setting = new MainPageSettings(driver1);
        setting.clickPublic();
        setting.clickChecked1();
        setting.clickSave();

        new UserMainPage(driver).clickHisFriend();
        Assert.assertTrue(new Return(driver).testSubscription());
    }

    @After
    public void testCaseAfter() {
        stop1();
    }

}
