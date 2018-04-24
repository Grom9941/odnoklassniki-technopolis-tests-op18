package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchError extends HelperBase {

    private static final By CHECK_PAGE = By.xpath("//div[@id='hook_Block_MiddleColumnTopCardFriend']/div/div/div/div/span/h1");

    SearchError(WebDriver driver) {
        super(driver);
        error();
    }

    protected void check() {

    }

    private void error() {
        Assert.assertFalse(isElementPresent(CHECK_PAGE));
        System.out.println("Ошибка");
        System.exit(0);
    }
}
