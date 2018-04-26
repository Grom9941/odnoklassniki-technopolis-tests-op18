package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Return extends HelperBase{

    private static final By CHECK_CLOSE = By.xpath(".//*[@class='stub-empty_t']");
    private static final By CHECK_AGE = By.xpath("//div[@data-type='AGE']");
    private static final By CHECK_SUBSCRIB = By.xpath("//*[@href='/profile/571546738044/subscriptions' or @href='/profile/571546738044/subscribers']");

    public Return(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public String textBlackList() {
        return driver.findElement(CHECK_CLOSE).getText();
    }

    public String textAge() {
        return driver.findElement(CHECK_AGE).getText();
    }

    public boolean testSubscription() {
        return isElementPresent(CHECK_SUBSCRIB);
    }
}
