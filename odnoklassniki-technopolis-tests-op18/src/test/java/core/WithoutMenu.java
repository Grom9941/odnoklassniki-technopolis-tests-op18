package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutMenu extends MainPageBlackList implements InterfaceBlackList {

    WithoutMenu(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.id("action_menu_expand_item")));
    }

    @Override
    public void clickBlackList() {
        System.out.println("Отсутствует панель действия");
    }
}
