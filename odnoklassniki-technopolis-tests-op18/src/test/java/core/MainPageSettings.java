package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSettings extends HelperBase {

    public MainPageSettings(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public void clickChecked() {
        click(By.xpath(".//input[contains(@name, 'st.accessForAGE') and @value='2']"));
    }

    public  void  clickChecked1() {
        click(By.xpath(".//input[contains(@name, 'st.accessForSUBSCRIPTION_VISIBILITY') and @value='2']"));
    }

    public void clickPublic() {
        click(By.xpath("//div[@id='UserSettingsMenu']/div/div/a[2]/span"));
    }

    public void clickSave() {
        click(By.xpath(".//*[@id='hook_FormButton_button_changeProfileType']"));
    }

}
