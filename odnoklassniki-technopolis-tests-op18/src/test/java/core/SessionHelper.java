package core;

import model.TestBot;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionHelper extends HelperBase{

    private static final By INPUT = By.xpath(".//*[contains(@value,'Войти')]");

    public SessionHelper(WebDriver driver){
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("field_email")));
    }

    public void doLogin(TestBot testBot) {

        type(testBot.getLogin(),By.id("field_email"));
        type(testBot.getPassword(),By.id("field_password"));

        Assert.assertTrue("Не вошел", isElementPresent(INPUT));
        click(INPUT);
    }
}
