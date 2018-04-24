package core;

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
        click(By.xpath("//a[@id='ts_def']/div"));
        click(By.xpath("//a[contains(text(),'QA18testbot18 QA18testbot18')]"));
    }

    public PromisSearch clickAccount() {
        click(By.xpath("//a[@id='ts_def']/div"));
        click(By.xpath("//a[contains(text(),'QA18testbot17 QA18testbot17')]"));
        return new PromisSearch(driver);
    }

    public void addFriend() {
        click(ADD);
    }

    public void clickAccept() {
        click(OK_SUBMIT);
    }

    public void clickHisFriend() {
        click(HIS_FRIEND);
    }
}
