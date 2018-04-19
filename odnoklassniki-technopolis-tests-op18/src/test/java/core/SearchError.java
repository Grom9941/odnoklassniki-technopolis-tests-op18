package core;

import org.openqa.selenium.WebDriver;

public class SearchError extends HelperBase {

    public SearchError(WebDriver driver) {
        super(driver);
        error();
    }

    protected void check() {

    }

    public void error () {
        System.out.println("Не правильно введены данные");
    }
}
