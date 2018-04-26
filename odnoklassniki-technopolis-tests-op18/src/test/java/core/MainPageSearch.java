package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSearch extends HelperBase{

    private static final By OK_SUBMIT = By.xpath("//span[@onclick='OK.submit(this)']");
    private static final By HIS_FRIEND = By.xpath("//*[contains(@href, 'friend') and contains(@class, 'mctc_navMenuSec')]");
    private static final By ADD = By.xpath("//span[@class='dropdown_ac button-pro __wide']");

    public  MainPageSearch(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public PromisSearch clickAccount1() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546737787")));
        click(By.id("tslink0571546737787"));
        return new PromisSearch(driver);
    }

    public PromisSearch clickAccount() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546738044")));
        click(By.id("tslink0571546738044"));
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
