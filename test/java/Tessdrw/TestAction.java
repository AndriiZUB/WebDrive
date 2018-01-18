package Tessdrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Kuchynskyi on 15.01.2018.
 */
public class TestAction {
    @Test
    public void explicitWait() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        menu.click();

        WebElement services = driver.findElement(By.xpath("//span[text()='Services']"));
        WebElement qa = driver.findElement(By.xpath("//span[text()='Quality Assurance']"));

        Actions action = new Actions(driver);
        action.moveToElement(services)
                .moveByOffset(500, 0)
                .moveToElement(qa)
                .click()
                .moveByOffset(-500, 500)
                .perform();
    }

    @Test
    public void dragDrop() {

    }
}
