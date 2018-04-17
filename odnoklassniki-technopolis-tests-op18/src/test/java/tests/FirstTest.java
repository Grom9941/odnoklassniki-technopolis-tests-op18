package tests;

import core.*;
import model.TestBot;
import model.TestBot1;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends TestBase{

    @Test
    public void testCase() throws Exception {

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot18", "QA18testbot "));
        MainPageSearch friend = new MainPageSearch(driver);
        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546738044"));
        friend.clickAccount();

        MainPageBlackList blackList = new MainPageBlackList(driver);
        blackList.clickOtherAction();
        blackList.clickComplain1();
        blackList.clickChecked();
        blackList.clickComplain2();
        blackList.clickClose();

        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();

        new SessionHelper(driver).doLogin(new TestBot("QA18testbot17", "QA18testbot"));
        new SearchHelper(driver).doSesrch(new TestBot1("/profile/571546737787"));
        friend.clickAccount1();

        String str = driver.findElement(By.xpath("//div[@id='frFriendsPanel']/div/div/div[2]")).getText();
        Assert.assertEquals(str,"Информация недоступна.\nЭтот пользователь добавил вас в «чёрный список».");

    }
}