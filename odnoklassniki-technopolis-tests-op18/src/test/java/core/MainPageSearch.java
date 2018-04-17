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

    public void clickAccount1() {
        click(By.xpath("//a[@id='ts_def']/div"));
        click(By.xpath("//a[contains(text(),'QA18testbot18 QA18testbot18')]"));
    }

    public void clickAccount() {
        click(By.xpath("//a[@id='ts_def']/div"));
        click(By.xpath("//a[contains(text(),'QA18testbot17 QA18testbot17')]"));
    }
}
