package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Factory extends HelperBase{


    public Factory(WebDriver driver) {
        super(driver);
    }

    public void get() {
        if (isActionMenu()) {
            new MainPageBlackList(driver);
        } else {
            new SearchError(driver);
        }
    }

    private boolean isActionMenu() {
        return isElementPresent(By.id("action_menu_expand_item_a"));
    }

    protected void check() {

    }
}
