package TestMeta.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy (name = "login")
    WebElement login;

    @FindBy (name = "password")
    WebElement password;


    @FindBy (name = "subm")
    WebElement submit;

    public LoginPage(WebDriver driver){
         this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage enterCredential(String userLogin, String userPassword){
//        driver.findElement(By.name("login")).sendKeys(userLogin);
//        driver.findElement(By.name("password")).sendKeys(userPassword);
        login.sendKeys(userLogin);
        password.sendKeys(userPassword);
        return this;
    }

    public LoginPage clickSubmitButon() {
//        driver.findElement(By.name("subm")).click();
        submit.click();
        return this;
    }

    public ResultsPage login(String userLogin, String userPassword){
        this.enterCredential(userLogin, userPassword);
        this.clickSubmitButon();
        return new ResultsPage(this.driver);
    }

   // public void OpenMail(){
    //    driver.findElement(By.xpath(".//tr//td/a")).click();
   // }
}
