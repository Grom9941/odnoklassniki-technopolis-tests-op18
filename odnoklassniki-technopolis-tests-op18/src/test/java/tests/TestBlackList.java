package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.Assert;
import org.junit.Test;

public class TestBlackList extends TestBase{

    @Test
    public void testCase() {

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        MainPageSearch friend = new MainPageSearch(driver);
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546738044"));
        friend.clickAccount().search();

        InterfaceBlackList blackList = new FactoryMenu().getPage(driver);
        blackList.clickBlackList();
        blackList.clickChecked();
        blackList.clickComplain2();
        blackList.clickClose();

        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
        new SearchHelper(driver).doSearch(new TestBot1("/profile/571546737787"));
        friend.clickAccount1().search();

        Assert.assertEquals(new TextPage(driver).textBlackList(),"Информация недоступна.\nЭтот пользователь добавил вас в «чёрный список».");

    }
}