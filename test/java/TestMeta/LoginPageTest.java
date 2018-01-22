package TestMeta;

import TestMeta.pageObj.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test
    public void LoginPageTest() {
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://meta.ua");

        PageFactory.initElements(driver, LoginPage.class);
        LoginPage loginpage = new LoginPage(driver);



    }
}
