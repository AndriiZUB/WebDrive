package TestMeta.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
    private WebDriver driver;
    @FindBy(xpath="//div[@id=\"b3_cnt\"]//b")
    protected WebElement loginfail;
    @FindBy(id="id_send_email")
    protected WebElement sendEmail;
    @FindBy(id="message_body")
    protected WebElement testmail;

    public ResultsPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getfailmessage() {
   // loginfail = driver.findElement(By.xpath("//div[@id=\"b3_cnt\"]//b"));
    return loginfail.getText();
    }

    public String getSendMail() {
    //    sendEmail = driver.findElement(By.id("id_send_email"));
        return sendEmail.getText();
    }

    public String getTextMail(){
    //   testmail= driver.findElement(By.id("message_body"));
        return testmail.getText();
    }
    public void OpenMail(){
        driver.findElement(By.xpath(".//tr//td/a")).click();
    }
}
