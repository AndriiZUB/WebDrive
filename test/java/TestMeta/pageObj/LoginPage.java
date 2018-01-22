package TestMeta.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private WebElement login;
    private WebElement password;

    public LoginPage(WebDriver driver){
         this.driver= driver;
    }

    public LoginPage enterCredential(String userLogin, String userPassword){
        login.sendKeys(userLogin);
        password.sendKeys(userPassword);
        return this;
    }
}
