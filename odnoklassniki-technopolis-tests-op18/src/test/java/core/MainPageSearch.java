package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSearch extends HelperBase{

    public  MainPageSearch(WebDriver driver){
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("field_query")));
    }

    public PromiseSearch clickAccount1() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546737787")));
        click(By.id("tslink0571546737787"));
        return new PromiseSearch(driver);
    }

    public PromiseSearch clickAccount() {
        Assert.assertTrue("Нельзя перейти на другой аккаунт", isElementPresent(By.id("tslink0571546738044")));
        click(By.id("tslink0571546738044"));
        return new PromiseSearch(driver);
    }

}
