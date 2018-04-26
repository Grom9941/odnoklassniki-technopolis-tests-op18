package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchAccount extends HelperBase {

    private static final By CHECK_PAGE = By.xpath("//*[@class='mctc_name_tx bl']");

    SearchAccount(WebDriver driver) {
        super(driver);
        search();
    }

    protected void check(){
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(CHECK_PAGE));
    }

    private void search() {
        Assert.assertTrue(!driver.findElement(CHECK_PAGE).getText().equals(""));
        System.out.println("Зашли на страницу пользователя");
    }


}
