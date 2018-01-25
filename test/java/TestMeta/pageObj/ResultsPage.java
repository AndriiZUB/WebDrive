package TestMeta.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage {
    private WebDriver driver;

    protected WebElement username;
    protected WebElement loginfail;
    protected WebElement sendEmail;
    protected WebElement testmail;

    public ResultsPage (WebDriver driver) {
        this.driver = driver;
        //this.username = driver.findElement(By.xpath("//div[@id=\"_cnt\"]/b"));
    }

    public String getfailmessage() {
    loginfail = driver.findElement(By.xpath("//div[@id=\"b3_cnt\"]//b"));
    return loginfail.getText();
    }

    public String getSendMail() {
        sendEmail = driver.findElement(By.id("id_send_email"));
        return sendEmail.getText();
    }

    public String getTextMail(){
       testmail= driver.findElement(By.id("message_body"));
        return testmail.getText();
    }
}
