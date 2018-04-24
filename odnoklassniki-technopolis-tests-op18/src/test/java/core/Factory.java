package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Factory {

    private final static By ACTION_MENU = By.id("action_menu_expand_item_a");

    public InterfaceBlackList get(WebDriver driver) {
        if (isActionMenu(driver)) {
            return new DoWithActionMenu(driver);
        } else {
            return new WithoutMenu(driver);
        }
    }

    private boolean isActionMenu(WebDriver driver) {
        return driver.findElement(ACTION_MENU).isDisplayed();
    }

}
