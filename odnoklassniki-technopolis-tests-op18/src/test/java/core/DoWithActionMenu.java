package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoWithActionMenu extends MainPageBlackList implements InterfaceBlackList{

    private static final By OTHER_ACTION = By.xpath("//a[@id='action_menu_expand_item_a']/span/em");
    private static final By COMPLAINT = By.xpath("//a[@id='action_menu_sub_action_menu_complaint_friend_a']/span");

    public DoWithActionMenu(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    @Override
    public void clickBlackList(){
        Assert.assertTrue("Не найдена панель меню", isElementPresent(OTHER_ACTION));
        driver.findElement(OTHER_ACTION).click();
        Assert.assertTrue("Не возможно пожаловаться", isElementPresent(COMPLAINT));
        driver.findElement(COMPLAINT).click();
    }

}
