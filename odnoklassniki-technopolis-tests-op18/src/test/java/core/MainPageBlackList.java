package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageBlackList extends HelperBase implements Interface {

    public MainPageBlackList(WebDriver driver){
        super(driver);
        clickOtherAction();
        clickComplain1();
        clickChecked();
        clickComplain2();
        clickClose();
    }

    protected void check() {

    }


    private void clickOtherAction() {
        click(By.xpath("//a[@id='action_menu_expand_item_a']/span/em"));
    }

    private void clickComplain1() {
        click(By.xpath("//a[@id='action_menu_sub_action_menu_complaint_friend_a']/span"));
    }

    private void clickChecked() {
        click(By.id("field_addToBlackList"));
    }

    private void clickComplain2() {
        click(By.id("hook_FormButton_button_register"));
    }

    private void clickClose() {
        click(By.id("buttonId_button_close"));
    }
}
