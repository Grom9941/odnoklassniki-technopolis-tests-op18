package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSearch extends HelperBase{

    private static final By USER_MAIN = By.xpath("//*[@class='toolbar_logo_img']");
    private static final By CHECK_NAME = By.xpath("//*[@class='mctc_name_tx bl']");
    private static final By CHECK_NAME1 = By.xpath("//*[@class='nav-side_i ellip __with-ic']");
    private static final By FRIEND = By.xpath("//*[@class='toolbar_nav_a toolbar_nav_a__friends']");
    private static final By MOVE_TO_PHOTO = By.xpath("//*[@class='stub-img stub-img__user128-female stub-img__128 photo_img']");
    private static final By FRIEND_DELETE = By.xpath(".//*[text() = 'Прекратить дружбу']");
    private static final By DISCONTINUE = By.xpath("//*[@class='button-pro form-actions_yes']");
    private static final By CLOSE = By.id("hook_FormButton_button_close");

    public  MainPageSearch(WebDriver driver){
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("field_query")));
    }

    public PromiseSearch clickAccount1() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546737787")));
        click(By.id("tslink0571546737787"));
        Assert.assertEquals("QA18testbot18 QA18testbot18", driver.findElement(CHECK_NAME).getText());
        return new PromiseSearch(driver);
    }

    public PromiseSearch clickAccount() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546738044")));
        click(By.id("tslink0571546738044"));
        Assert.assertEquals("QA18testbot17 QA18testbot17", driver.findElement(CHECK_NAME).getText());
        return new PromiseSearch(driver);
    }

    public void clickUserMain() {
        Assert.assertTrue("Нельзя перейти на аккаунт", isElementPresent(USER_MAIN));
        click(USER_MAIN);
        Assert.assertEquals("QA18testbot17 QA18testbot17", driver.findElement(CHECK_NAME1).getText());
    }

    public void clickFriend() {
        Assert.assertTrue("Нельзя перейти в друзья", isElementPresent(FRIEND));
        click(FRIEND);
    }

    public void moveToAccount() {
        new Actions(driver).moveToElement(driver.findElement(MOVE_TO_PHOTO)).build().perform();
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(FRIEND_DELETE));
    }

    public void clickFriendDelete() {
        click(FRIEND_DELETE);
    }

    public void clickDiscontinue() {
        click(DISCONTINUE);
    }

    public void clickClose(){
        click(CLOSE);
    }
}
