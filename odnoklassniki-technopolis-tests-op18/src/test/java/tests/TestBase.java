package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase {

    protected String baseUrl;
    protected WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    protected WebDriver driver1;
    protected String baseUrl1;
    private StringBuffer verificationErrors1 = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        init();
    }

    @After
    public void tearDown() throws Exception {
        stop();
    }

    public void init() {
        driver = new ChromeDriver();
        baseUrl = "https://ok.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public void init1() {
        driver1 = new ChromeDriver();
        baseUrl1 = "https://ok.ru/";
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver1.get(baseUrl1);
    }

    public void stop1() {
        driver1.quit();
        String verificationErrorString = verificationErrors1.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
