package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageFriend extends HelperBase{
    private WebDriver driver;

    public  MainPageFriend(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickFriend() {
        click(By.xpath("//div[@id='hook_Block_HeaderTopFriendsInToolbar']"));
    }

    public void clickAccount() {
        click(By.xpath(".//*[@href='/profile/564236108186']"));
    }
}
