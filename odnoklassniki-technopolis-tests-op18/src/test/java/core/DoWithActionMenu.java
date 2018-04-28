package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoWithActionMenu extends MainPageBlackList implements InterfaceBlackList{

    private static final By OTHER_ACTION = By.xpath("//*[@class='tico_simb_txt']");
    private static final By COMPLAINT = By.xpath("//a[@id='action_menu_sub_action_menu_complaint_friend_a']");
    private static final By CHECK = By.xpath("//*[@class='portlet_h portlet_h__sa ']");

    public DoWithActionMenu(WebDriver driver){
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("action_menu_expand_item")));
    }

    @Override
    public void clickBlackList(){
        Assert.assertTrue("Не найдена панель меню", isElementPresent(OTHER_ACTION));
        driver.findElement(OTHER_ACTION).click();
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(COMPLAINT));
        driver.findElement(COMPLAINT).click();
        Assert.assertEquals("Жалоба на пользователя",driver.findElement(CHECK).getText());
    }

}
