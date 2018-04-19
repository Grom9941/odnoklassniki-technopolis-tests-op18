package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends TestBase{

    @Test
    public void testCase() {

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        MainPageSearch friend = new MainPageSearch(driver);
        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546738044")).search();
        friend.clickAccount();

        new Factory(driver).get();

        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546737787")).search();
        friend.clickAccount1();

        String str = new TextPage(driver).textBlackList();
        Assert.assertEquals(str,"Информация недоступна.\nЭтот пользователь добавил вас в «чёрный список».");

    }
}