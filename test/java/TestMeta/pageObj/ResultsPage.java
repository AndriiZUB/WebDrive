package TestMeta.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
    private WebDriver driver;

    protected WebElement username;

    public ResultsPage (WebDriver driver) {
        this.driver = driver;
        this.username = driver.findElement(By.xpath("//div[@id=\"_cnt\"]/b"));
    }
    public String getUsername() {
        return username.getText();
    }

}
