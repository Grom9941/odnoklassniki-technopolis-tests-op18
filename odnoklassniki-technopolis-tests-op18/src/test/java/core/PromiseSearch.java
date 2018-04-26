package core;

import org.openqa.selenium.WebDriver;

public class PromiseSearch {

    private final WebDriver driver;

    public PromiseSearch (WebDriver driver) {
        this.driver = driver;
    }


    public SearchAccount search() {
        return new SearchAccount(driver);
    }

    public SearchError error() {
        return new SearchError(driver);
    }

}
