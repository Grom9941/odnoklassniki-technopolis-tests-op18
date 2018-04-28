package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Return extends HelperBase{

    private static final By CHECK_CLOSE = By.xpath(".//*[@class='stub-empty_t']");
    private static final By CHECK_AGE = By.xpath("//div[@data-type='AGE']");
    private static final By CHECK_SUBSCRIBER = By.xpath("//*[contains(@href,'subscriptions') or contains(@href,'subscribers')]");
    private static final By NUMBER = By.xpath("//*[@class='hcount']");
    private static final By SUBSCRIPTION_VISIBILITY1 = By.xpath(".//input[contains(@name, 'SUBSCRIPTION_VISIBILITY') and @value='0']");
    private static final By AGE1 = By.xpath(".//input[contains(@name, 'ForAGE') and @value='0']");
    private static final By SAVE = By.xpath("//*[@class='iblock __ok js-hide-on-change']");

    public Return(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public String textBlackList() {
        if (isElementPresent(CHECK_CLOSE)) {
            return driver.findElement(CHECK_CLOSE).getText();
        } else return "";
    }

    public String textAge() {
        if (isElementPresent(CHECK_AGE)) {
            return driver.findElement(CHECK_AGE).getText();
        } else return "";
    }

    public String textSave() {
        if (isElementPresent(SAVE)) {
            return driver.findElement(SAVE).getText();
        } else return "";
    }

    public boolean testSubscription() {
        return isElementPresent(CHECK_SUBSCRIBER);
    }

    public boolean numberBlackList() {
        return isElementPresent(NUMBER);
    }

    public boolean checkedSelected() {
        return driver.findElement(SUBSCRIPTION_VISIBILITY1).isSelected();
    }

    public boolean checkedSelected1() {
        return driver.findElement(AGE1).isSelected();
    }

    public boolean checkedFriend() {
        return !isElementPresent(By.xpath("//*[@class='ucard-v']"));
    }
}
