package core;

import org.openqa.selenium.WebDriver;

public class SearchError extends HelperBase implements Interface{

    public SearchError(WebDriver driver) {
        super(driver);
        error();
    }

    protected void check() {

    }

    private void error() {
        System.out.println("Ошибка");
     //   System.exit(0);
    }
}
