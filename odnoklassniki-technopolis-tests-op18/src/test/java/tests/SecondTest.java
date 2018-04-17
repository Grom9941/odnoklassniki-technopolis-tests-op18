package tests;

import core.*;
import model.TestBot;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;

//import static org.junit.Assert.fail;

public class SecondTest extends TestBase{

    @Test
    public void testCase() throws Exception {
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

        driver.findElement(By.id("field_query")).clear();
        driver.findElement(By.id("field_query")).sendKeys("/profile/571546738044");
        friend.clickAccount();
        String str = driver.findElement(By.xpath("//div[@data-type='AGE']")).getText();
        Assert.assertEquals(str.split(" ").length,2);
    }

}
