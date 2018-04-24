package core;

import model.TestBot;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    private static final By INPUT = By.xpath(".//*[contains(@value,'Войти')]");

    public SessionHelper(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void doLogin(TestBot testBot) {

        type(testBot.getLogin(),By.id("field_email"));
        type(testBot.getPassword(),By.id("field_password"));

        Assert.assertTrue("Не вошел", isElementPresent(INPUT));
        click(INPUT);
    }
}
