package TestMeta.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "login")
    private WebElement login;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "subm")
    private WebElement subm;

    public LoginPage(WebDriver driver){
         this.driver= driver;
    }

    public LoginPage enterCredential(String userLogin, String userPassword){
        driver.findElement(By.name("login")).sendKeys(userLogin);
        driver.findElement(By.name("password")).sendKeys(userPassword);
        return this;
    }

    public LoginPage clickSubmitButon() {
        driver.findElement(By.name("subm")).click();
        return this;
    }

    public ResultsPage login(String userLogin, String userPassword){
        this.enterCredential(userLogin, userPassword);
        this.clickSubmitButon();
        return new ResultsPage(this.driver);
    }
}
