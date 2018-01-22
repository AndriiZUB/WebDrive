package Tessdrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Kuchynskyi on 15.01.2018.
 */
public class Waits {
    @Test
    public void  implicitWait () {
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //test

        driver.get("https://www.google.com.ua");

        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");
        inp.submit();
        WebElement btn = driver.findElement(By.name("btnK"));
        btn.click();

        WebElement urbanLink = driver.findElement(By.partialLinkText("Urban Dictionary:"));
        Assert.assertTrue(driver.getTitle().contains("tralala"));
    }
    @Test
    public void explicitwait() {
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com.ua");
        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");
        inp.submit();
        WebElement btn = driver.findElement(By.name("btnK"));
        btn.click();

        /*new WebDriverWait(driver, 10).until(
                ExpectedConditions.invisibilityOfElementLocated(
                        By.id("hplogo")
                )
        );*/
        try{
           // Thread.sleep(1000);
            WebElement logo = driver.findElement(By.id("hplogo"));
            System.out.println("we are in trouble");
        }
        catch (NoSuchElementException e){
            System.out.println("");
        }
    }
}
