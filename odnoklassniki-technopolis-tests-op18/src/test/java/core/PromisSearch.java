package core;

import org.openqa.selenium.WebDriver;

public class PromisSearch {

    private final WebDriver driver;

    public PromisSearch (WebDriver driver) {
        this.driver = driver;
    }


    public SearchAccount search() {
        return new SearchAccount(driver);
    }

    public SearchError error() {
        return new SearchError(driver);
    }

}
