package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageExit extends HelperBase{

    public  MainPageExit(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickBlockQuit() {
        click(By.xpath("//div[@id='hook_Block_ToolbarUserDropdown']/div/div/div[2]/div"));
    }

    public void clickQuit() {
        click(By.xpath("//*[@data-l='t,logoutCurrentUser']"));
    }

    public void clickConfirm() {
        click(By.xpath(".//*[@id='hook_FormButton_logoff.confirm_not_decorate']"));
    }
}
