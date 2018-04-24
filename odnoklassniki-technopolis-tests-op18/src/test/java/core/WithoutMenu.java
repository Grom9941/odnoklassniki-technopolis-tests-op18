package core;

import org.openqa.selenium.WebDriver;

public class WithoutMenu extends MainPageBlackList implements InterfaceBlackList {

    WithoutMenu(WebDriver driver) {
        super(driver);
    }

    protected void check() {
    }

    @Override
    public void clickBlackList() {
        System.out.println("Не правильная версия сайта");
    }
}
