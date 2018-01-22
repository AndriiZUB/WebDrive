package Tessdrw;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Andrii.Kuchynskyi on 15.01.2018.
 */
public class javaScriptExecution {
    @Test
    public void executeJavascriptSync(){
        System.setProperty("webdriver.gecko.driver", "test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");

        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");

        JavascriptExecutor js = (JavascriptExecutor) driver.findElement(By.name("q"));
        js.executeScript("alert('Hello. How are you&);");

//JavascriptExecutor;



        inp.submit();
        WebElement btn = driver.findElement(By.name("btnK"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click()",btn);


    }
}
