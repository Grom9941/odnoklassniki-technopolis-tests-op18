package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageBlackList extends HelperBase  {

    public MainPageBlackList(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickChecked() {
        click(By.id("field_addToBlackList"));
    }

    public void clickComplain2() {
        click(By.id("hook_FormButton_button_register"));
    }

    public void clickClose() {
        click(By.id("buttonId_button_close"));
    }
}
