package pageobjectdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectdemo.pageobjects.ResultPage;
import pageobjectdemo.pageobjects.SearchPage;

/**
 * Created by Andrii.Kuchynskyi on 18.01.2018.
 */
public class PageObjectTest {
    @Test
    public void pageobjectTest() {
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");

        PageFactory.initElements(driver, SearchPage.class);
        SearchPage searchPage = new SearchPage(driver);

        ResultPage resultPage = searchPage.search("tralala");
        Assert.assertTrue(resultPage.titleContains("tralala"),
                "Caption does not contain tralala");

    }
}
