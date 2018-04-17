package core;

import model.TestBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSearch extends HelperBase{
    private WebDriver driver;

    public  MainPageSearch(WebDriver driver){
        super(driver);
    }

    protected void check() {

    }

   // public void doSearch(TestBot testBot) {
   //     type(testBot.getSearch(),By.id("field_query"));
   // }

    public void clickAccount() {
//        driver.findElement(By.id("field_query")).clear();
//        driver.findElement(By.id("field_query")).sendKeys("/profile/571546737787");
        click(By.xpath("//a[@id='ts_def']/div"));
        click(By.xpath("//a[contains(text(),'QA18testbot17 QA18testbot17')]"));
    }
}
