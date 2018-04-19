package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextPage extends HelperBase{

    public TextPage(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public String textBlackList() {
        return driver.findElement(By.xpath("//div[@id='frFriendsPanel']/div/div/div[2]")).getText();
    }

    public String textAge() {
        return driver.findElement(By.xpath("//div[@data-type='AGE']")).getText();
    }
}
