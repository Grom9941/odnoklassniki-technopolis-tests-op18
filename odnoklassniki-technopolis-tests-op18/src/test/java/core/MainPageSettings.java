package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSettings extends HelperBase {

    private static final By SUBSCRIPTION_VISIBILITY = By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='2']");
    private static final By AGE = By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='2']");
    private static final By SETTINGS_MENU = By.xpath(".//*[text() = 'Публичность']");

    public MainPageSettings(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='portlet_b']")));
    }

    public void clickChecked() {
        click(AGE);
    }

    public  void  clickChecked1() {
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(SUBSCRIPTION_VISIBILITY));
        click(SUBSCRIPTION_VISIBILITY);
    }

    public void clickPublic() {
        click(SETTINGS_MENU);
    }

    public void clickSave() {
         click(By.id("hook_FormButton_button_changeProfileType"));
    }

}
