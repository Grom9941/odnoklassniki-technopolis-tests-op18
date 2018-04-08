package tests;

import core.*;
import model.TestBot;
import org.junit.Test;

import static org.junit.Assert.fail;

public class SecondTest extends TestBase{

    @Test
    public void testCase() throws Exception {
        new SessionHelper(driver).doLogin(new TestBot("technopolisbot", "technopolis16"));
        new UserMainPageHelper(driver).clickMySettings();
        MainPageSettings setting = new MainPageSettings(driver);
        setting.clickPublic();
        setting.clickChecked();
        setting.clickSave();
        MainPageExit quit = new MainPageExit(driver);
        quit.clickBlockQuit();
        quit.clickQuit();
        quit.clickConfirm();
        //todo проверка созданой группы
    }

}
