package Tessdrw;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Andrii.Kuchynskyi on 15.01.2018.
 */
public class Screetshooting {
    @Test
    public static void takeScreenshot() {
        System.setProperty("webdriver.gecko.driver", "test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");

        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");

        WebElement btn = driver.findElement(By.name("btnK"));
        btn.click();

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(screenshot,new FileOutputStream());

        System.out.println("screenshoting");

    }
}
