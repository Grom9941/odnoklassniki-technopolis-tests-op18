package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMainPage extends HelperBase {

    private static final By BLOCK_QUIT = By.xpath("//*[@class='ucard-mini_cnt_i']");
    private static final By OK_SUBMIT = By.xpath("//span[@onclick='OK.submit(this)']");
    private static final By HIS_FRIEND = By.xpath("//*[contains(@href, 'friend') and contains(@class, 'mctc_navMenuSec')]");
    private static final By ADD = By.xpath("//span[@class='dropdown_ac button-pro __wide']");
    private static final By LEFT_COLUMN = By.xpath("//div[@id='hook_Block_LeftColumnTopCardUser']/ul/li[3]");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='toolbar_c']")));
    }

    public void clickMySettings() {
        click(LEFT_COLUMN);
    }

    public void clickBlockQuit() {
        Assert.assertTrue("Не найдена кнопка выйти", isElementPresent(BLOCK_QUIT));
        click(BLOCK_QUIT);
    }

    public void addFriend() {
        Assert.assertTrue("Не добавлен в друзья", isElementPresent(ADD));
        click(ADD);
    }

    public void clickAccept() {
        Assert.assertTrue("Не подтвержденно", isElementPresent(OK_SUBMIT));
        click(OK_SUBMIT);
        if (isElementPresent(By.xpath("//*[@class='tico_img ic ic_close-g']"))){
            click(By.xpath("//*[@class='tico_img ic ic_close-g']"));
        }
    }

    public void clickHisFriend() {
        Assert.assertTrue("Не перешел к другу", isElementPresent(HIS_FRIEND));
        click(HIS_FRIEND);
    }
}
