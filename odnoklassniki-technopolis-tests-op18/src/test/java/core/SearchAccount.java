package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchAccount extends HelperBase {

    public static final By CHECK_PAGE = By.xpath("//div[@id='hook_Block_MiddleColumnTopCardFriend']/div/div/div/div/span/h1");

    public SearchAccount(WebDriver driver) {
        super(driver);
        search();
    }

    protected void check() {

    }

    private void search() {
        Assert.assertEquals("QA18testbot17 QA18testbot17",driver.findElement(CHECK_PAGE).getText());
        System.out.println("Зашли на страницу пользователя");
    }
}
