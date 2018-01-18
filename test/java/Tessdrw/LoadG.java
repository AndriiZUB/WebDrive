package Tessdrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Andrii.Kuchynskyi on 11.01.2018.
 */
public class LoadG {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");

        WebElement inp = driver.findElement(By.name("q"));
        inp.sendKeys("tralala");
        inp.submit();
        WebElement btn = driver.findElement(By.name("btnK"));
        btn.click();

        driver.close();
        //driver.quit();

    }
}
