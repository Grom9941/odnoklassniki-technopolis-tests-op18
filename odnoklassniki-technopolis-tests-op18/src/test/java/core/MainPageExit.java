package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageExit extends HelperBase{

    private static final By LOGOUT = By.xpath("//*[@data-l='t,logoutCurrentUser']");
    private static final By FORM_BUTTON = By.id("hook_FormButton_logoff.confirm_not_decorate");

    public  MainPageExit(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickQuit() {
        Assert.assertTrue( isElementPresent(LOGOUT));
        click(LOGOUT);
    }

    public void clickConfirm() {
        Assert.assertTrue("Не возможно подтвердить выход", isElementPresent(FORM_BUTTON));
        click(FORM_BUTTON);
        Assert.assertTrue(isElementPresent(By.id("field_query")));
    }
}
