package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMainPage extends HelperBase {

    private static final By REQUEST = By.xpath("//*[@class='dropdown_ac button-pro __sec __with-arrow']");
    private static final By BLOCK_QUIT = By.xpath("//*[@class='ucard-mini_cnt_i']");
    private static final By OK_SUBMIT = By.xpath("//span[@onclick='OK.submit(this)']");
    private static final By HIS_FRIEND = By.xpath("//*[contains(@href, 'friend') and contains(@class, 'mctc_navMenuSec')]");
    private static final By ADD = By.xpath("//span[@class='dropdown_ac button-pro __wide']");
    private static final By LEFT_COLUMN = By.xpath("//div[@id='hook_Block_LeftColumnTopCardUser']/ul/li[3]");
    private static final By CLOSE_FIELD = By.xpath("//*[@class='tico_img ic ic_close-g']");
    private static final By REQUEST_FRIEND = By.xpath("//*[@class='notifications h-mod']");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='toolbar_c']")));
    }

    public void clickMySettings() {
        Assert.assertTrue("Нет кнопки настройка приватности", isElementPresent(LEFT_COLUMN));
        click(LEFT_COLUMN);
    }

    public void clickBlockQuit() {
        Assert.assertTrue("Не найдена кнопка выйти", isElementPresent(BLOCK_QUIT));
        click(BLOCK_QUIT);
    }

    public void addFriend() {
        if (isElementPresent(ADD)) {
            click(ADD);
            Assert.assertEquals("Запрос отправлен", driver.findElement(REQUEST).getText());
        }

    }

    public void clickAccept() {
        if (isElementPresent(OK_SUBMIT)) {
            click(OK_SUBMIT);
            if (isElementPresent(CLOSE_FIELD)) {
                click(CLOSE_FIELD);
                Assert.assertFalse("Не было оповещания",isElementPresent(REQUEST_FRIEND));
            }
        }
    }

    public void clickHisFriend() {
        Assert.assertTrue("Не перешел к другу", isElementPresent(HIS_FRIEND));
        click(HIS_FRIEND);
    }
}
