package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoWithActionMenu extends MainPageBlackList implements InterfaceBlackList{

    private static final By OTHER_ACTION = By.xpath("//a[@id='action_menu_expand_item_a']/span/em");
    private static final By COMPLAINT = By.xpath("//a[@id='action_menu_sub_action_menu_complaint_friend_a']/span");

    public  DoWithActionMenu(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    @Override
    public void clickBlackList(){
        driver.findElement(OTHER_ACTION).click();
        driver.findElement(COMPLAINT).click();
    }

}
