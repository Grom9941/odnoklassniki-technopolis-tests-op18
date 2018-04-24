package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageBlackList extends HelperBase  {

    public MainPageBlackList(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

    public void clickChecked() {
        Assert.assertTrue("Нельзя добавить в черный список", isElementPresent(By.id("field_addToBlackList")));
        click(By.id("field_addToBlackList"));
    }

    public void clickComplain2() {
        Assert.assertTrue("??????????", isElementPresent(By.id("hook_FormButton_button_register")));
        click(By.id("hook_FormButton_button_register"));
    }

    public void clickClose() {
        Assert.assertTrue("Не возможно закрыть", isElementPresent(By.id("buttonId_button_close")));
        click(By.id("buttonId_button_close"));
    }
}
