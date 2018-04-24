package core;

import model.TestBot1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase{

    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public void doSesrch(TestBot1 testBot1) {

        type(testBot1.getSearch(),By.id("field_query"));
    }
}
