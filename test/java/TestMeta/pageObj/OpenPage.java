package TestMeta.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPage {
    private WebDriver driver;

    public OpenPage(WebDriver driver){
        this.driver=driver;
    }

    public void openPage(){
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://meta.ua");
        //return this;
    }
}
