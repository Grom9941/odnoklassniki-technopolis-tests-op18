package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Thread.sleep;

public class TestBlackList extends TestBase{

    @Test
    public void testCase() {

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        MainPageAdditional additional = new MainPageAdditional(driver);
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));
        additional.clickAccount().search();

        InterfaceBlackList blackList = new FactoryMenu().getPage(driver);
        blackList.clickBlackList();
        blackList.clickChecked();
        blackList.clickComplain2();
        blackList.clickClose();

        new UserMainPage(driver).clickBlockQuit();
        MainPageExit quit = new MainPageExit(driver);
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546737787"));
        additional.clickAccount1().search();

        Assert.assertEquals(new Return(driver).textBlackList(),"Информация недоступна.\nЭтот пользователь добавил вас в «чёрный список».");
    }

    @After
    public void after() throws InterruptedException {
        init1();
        new SessionHelper(driver1).doLogin(new TestBot("QA18testbot18", "QA18testbot "));

        new UserMainPage(driver1).clickMySettings();
        MainPageSettings setting = new MainPageSettings(driver1);
        setting.clickBlackList();
        setting.moveToAccount();
        setting.clickUnlock();
        setting.clickDelete();
        sleep(1);
        Assert.assertTrue(new Return(driver1).numberBlackList());
        stop1();
    }
}