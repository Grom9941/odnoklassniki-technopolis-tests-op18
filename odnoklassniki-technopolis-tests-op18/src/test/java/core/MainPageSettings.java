package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSettings extends HelperBase {

    private static final By LEFT_COLUMN = By.xpath("//div[@id='hook_Block_LeftColumnTopCardUser']/ul/li[3]/a/span");
    private static final By SUBSCRIPTION_VISIBILITY = By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='2']");
    private static final By AGE = By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='2']");
    private static final By SETTINGS_MENU = By.xpath("//div[@id='UserSettingsMenu']/div/div/a[2]/span");

    public MainPageSettings(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public void clickMySettings() {
        click(LEFT_COLUMN);
    }

    public void clickChecked() {
        click(AGE);
    }

    public  void  clickChecked1() {
        click(SUBSCRIPTION_VISIBILITY);
    }

    public void clickPublic() {
        click(SETTINGS_MENU);
    }

    public void clickSave() {
           // click(By.xpath(".//*[@id='hook_FormButton_button_changeProfileType']"));
         click(By.id("hook_FormButton_button_changeProfileType"));
    }

}
