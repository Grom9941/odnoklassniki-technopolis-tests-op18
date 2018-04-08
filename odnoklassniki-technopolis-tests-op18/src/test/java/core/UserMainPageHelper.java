package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMainPageHelper extends HelperBase {
    private WebDriver driver;

    public  UserMainPageHelper(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickMySettings() {
        click(By.xpath("//div[@id='hook_Block_LeftColumnTopCardUser']/ul/li[3]/a/span"));
    }
}
