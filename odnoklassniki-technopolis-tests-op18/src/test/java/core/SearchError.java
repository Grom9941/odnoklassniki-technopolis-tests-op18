package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchError extends HelperBase {

    private static final By CHECK_PAGE = By.xpath("//*[@class='mctc_name_tx bl']");

    SearchError(WebDriver driver) {
        super(driver);
        error();
    }

    protected void check() {

    }

    private void error() {
        Assert.assertFalse(isElementPresent(CHECK_PAGE));
        System.out.println("Не перешли на нужны профиль");
        Assert.assertEquals(1,1);
    }
}
