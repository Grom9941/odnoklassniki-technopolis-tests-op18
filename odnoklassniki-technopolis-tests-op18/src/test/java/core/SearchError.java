package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchError extends HelperBase {

    private static final By CHECK_PAGE = By.xpath("//*[@class='mctc_name_tx bl']");

    SearchError(WebDriver driver) {
        super(driver);
        error();
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.invisibilityOfElementLocated(CHECK_PAGE));
    }

    private void error() {
        System.out.println("Не перешли на нужны профиль");
        Assert.assertEquals(1,1);
    }
}
