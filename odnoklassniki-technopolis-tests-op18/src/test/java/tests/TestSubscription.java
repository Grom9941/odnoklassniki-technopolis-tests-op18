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
    public void before() {
        init1();
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));

        MainPageAdditional additional = new MainPageAdditional(driver);
        additional.clickAccount().search();
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

        new UserMainPage(driver1).clickHisFriend();
        Assert.assertTrue(new Return(driver1).testSubscription());
    }

    @After
    public void after() {
        MainPageAdditional additional = new MainPageAdditional(driver1);
        additional.clickUserMain();
        new UserMainPage(driver1).clickMySettings();

        MainPageSettings setting = new MainPageSettings(driver1);
        setting.clickPublic();
        setting.clickChecked2();
        setting.clickSave();
        Assert.assertTrue(new Return(driver1).checkedSelected());

        additional.clickFriend();
        additional.moveToAccount();
        additional.clickFriendDelete();
        additional.clickDiscontinue();
        additional.clickClose();
        Assert.assertFalse(new Return(driver1).checkedFriend());

        stop1();
    }

}
