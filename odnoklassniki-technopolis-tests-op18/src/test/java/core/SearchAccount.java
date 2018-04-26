package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchAccount extends HelperBase {

    private static final By CHECK_PAGE = By.xpath("//*[@class='mctc_name_tx bl']");

    SearchAccount(WebDriver driver) {
        super(driver);
        search();
    }

    protected void check(){}

    private void search() {
        Assert.assertTrue(isElementPresent(CHECK_PAGE));
        Assert.assertTrue(driver.findElement(CHECK_PAGE).getText()!="");
        System.out.println("Зашли на страницу пользователя");
    }


}
