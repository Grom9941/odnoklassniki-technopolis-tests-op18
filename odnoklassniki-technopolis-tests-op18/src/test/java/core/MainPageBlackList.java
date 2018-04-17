package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageBlackList extends HelperBase {
    private WebDriver driver;

    public MainPageBlackList(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickOtherAction() {
        click(By.xpath("//a[@id='action_menu_expand_item_a']/span/em"));
    }

    public void clickComplain1() {
        click(By.xpath("//a[@id='action_menu_sub_action_menu_complaint_friend_a']/span"));
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
