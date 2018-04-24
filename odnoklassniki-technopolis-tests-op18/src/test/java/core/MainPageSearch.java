package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSearch extends HelperBase{

    private static final By OK_SUBMIT = By.xpath("//span[@onclick='OK.submit(this)']");
    private static final By HIS_FRIEND = By.xpath("//*[contains(@href, 'friend') and contains(@class, 'mctc_navMenuSec')]");
    private static final By ADD = By.xpath("//ul[@id='action_menu']/div/a/span");

    public  MainPageSearch(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickAccount1() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.xpath("//a[@id='ts_def']/div")));
        click(By.xpath("//a[@id='ts_def']/div"));
        Assert.assertTrue("Не правильный профиль", isElementPresent(By.xpath("//a[contains(text(),'QA18testbot18 QA18testbot18')]")));
        click(By.xpath("//a[contains(text(),'QA18testbot18 QA18testbot18')]"));
    }

    public PromisSearch clickAccount() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.xpath("//a[@id='ts_def']/div")));
        click(By.xpath("//a[@id='ts_def']/div"));
        Assert.assertTrue("Не правильный профиль", isElementPresent(By.xpath("//a[contains(text(),'QA18testbot17 QA18testbot17')]")));
        click(By.xpath("//a[contains(text(),'QA18testbot17 QA18testbot17')]"));
        return new PromisSearch(driver);
    }

    public void addFriend() {
        Assert.assertTrue("Не добавлен в друзья", isElementPresent(ADD));
        click(ADD);
    }

    public void clickAccept() {
        Assert.assertTrue("Не подтвержденно", isElementPresent(OK_SUBMIT));
        click(OK_SUBMIT);
    }

    public void clickHisFriend() {
        Assert.assertTrue("Не перешел к другу", isElementPresent(HIS_FRIEND));
        click(HIS_FRIEND);
    }
}
