package core;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSettings extends HelperBase {

    private static final By SUBSCRIPTION_VISIBILITY = By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='2']");
    private static final By SUBSCRIPTION_VISIBILITY1 = By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='0']");
    private static final By AGE = By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='2']");
    private static final By AGE1 = By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='0']");
    private static final By SETTINGS_PUBLIC = By.xpath(".//*[text() = 'Публичность']");
    private static final By SETTINGS_BLACKLIST = By.xpath(".//*[text() = 'Черный список ']");
    private static final By SETTINGS_UNLOCK = By.xpath(".//*[text() = 'Разблокировать']");
    private static final By MOVE_TO_PHOTO = By.xpath("//*[@class='stub-img stub-img__user128 stub-img__128 photo_img']");
    private static final By DELETE = By.xpath("//*[@class='button-pro form-actions_yes']");

    public MainPageSettings(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='portlet_b']")));
    }

    public void clickChecked() {
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(AGE));
        if (!driver.findElement(AGE).isSelected()) {
            click(AGE);
        }
    }

    public  void  clickChecked1() {
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(SUBSCRIPTION_VISIBILITY));
        if (!driver.findElement(SUBSCRIPTION_VISIBILITY).isSelected()) {
            click(SUBSCRIPTION_VISIBILITY);
        }
    }

    public void clickChecked2() {
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(SUBSCRIPTION_VISIBILITY));
        if (!driver.findElement(SUBSCRIPTION_VISIBILITY1).isSelected()) {
            click(SUBSCRIPTION_VISIBILITY1);
        }
    }

    public void clickChecked3() {
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(AGE1));
        if (!driver.findElement(AGE1).isSelected()) {
            click(AGE1);
        }
    }

    public void clickPublic() {
        click(SETTINGS_PUBLIC);
    }

    public void clickBlackList() {
        click(SETTINGS_BLACKLIST);
    }

    public void clickSave() {
        if (!isElementPresent(By.xpath("//*[@disabled='']"))) {
            click(By.id("hook_FormButton_button_changeProfileType"));
            Assert.assertEquals("Ваши настройки сохранены.",new Return(driver).textSave());
        }
    }

    public void moveToAccount() {
        new Actions(driver).moveToElement(driver.findElement(MOVE_TO_PHOTO)).build().perform();
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(SETTINGS_UNLOCK));
    }

    public void clickUnlock() {
        click(SETTINGS_UNLOCK);
    }

    public void clickDelete() {
        click(DELETE);
    }
}
