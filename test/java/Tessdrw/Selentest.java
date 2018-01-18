package Tessdrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Andrii.Kuchynskyi on 11.01.2018.
 */
public class Selentest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");

        driver = new FirefoxDriver();

    }
    @Test
    public void firstSelenTest() {
        driver.get("https://www.google.com.ua");

        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");
        inp.submit();
        WebElement btn = driver.findElement(By.name("btnK"));
        btn.click();
        Assert.assertTrue(driver.getTitle().contains("tralala"));
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
