package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Return extends HelperBase{

    private static final By CHECK_CLOSE = By.xpath(".//*[@class='stub-empty_t']");
    private static final By CHECK_AGE = By.xpath("//div[@data-type='AGE']");
    private static final By CHECK_SUBSCRIB = By.xpath("//*[@href='/profile/571546738044/subscriptions' or @href='/profile/571546738044/subscribers']");
    private static final By NUMBER = By.xpath("//*[@class='hcount']");
    private static final By SUBSCRIPTION_VISIBILITY1 = By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='0']");
    private static final By AGE1 = By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='0']");
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
        if (isElementPresent(CHECK_SUBSCRIB)) {
            return true;
        }
        return false;
    }

    public boolean numberBlackList() {
        if (isElementPresent(NUMBER)) {
            return true;
        }
        return false;
    }

    public boolean checkedSelected() {
        if (driver.findElement(SUBSCRIPTION_VISIBILITY1).isSelected()) {
            return true;
        }
        return false;
    }

    public boolean checkedSelected1() {
        if (driver.findElement(AGE1).isSelected()) {
            return true;
        }
        return false;
    }

    public boolean checkedFriend() {
        if (!isElementPresent(By.xpath("//*[@class='ucard-v']"))) {
            return true;
        }
        return false;
    }
}
