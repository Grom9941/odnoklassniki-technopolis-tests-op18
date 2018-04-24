package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageExit extends HelperBase{

    private static final By BLOCK_QUIT = By.xpath("//div[@id='hook_Block_ToolbarUserDropdown']/div/div/div[2]/div");
    private static final By LOGOUT = By.xpath("//*[@data-l='t,logoutCurrentUser']");
    private static final By FORM_BUTTON = By.xpath(".//*[@id='hook_FormButton_logoff.confirm_not_decorate']");

    public  MainPageExit(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickBlockQuit() {
        Assert.assertTrue("Не найдена кнопка выйти???????", isElementPresent(BLOCK_QUIT));
        click(BLOCK_QUIT);
    }

    public void clickQuit() {
        Assert.assertTrue("Не возможно выйти????????", isElementPresent(LOGOUT));
        click(LOGOUT);
    }

    public void clickConfirm() {
        Assert.assertTrue("Не возможно подтвердить??????", isElementPresent(FORM_BUTTON));
        click(FORM_BUTTON);
    }
}
