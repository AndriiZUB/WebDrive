package TestMeta;

import TestMeta.pageObj.LoginPage;
import TestMeta.pageObj.ResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest {
    private WebDriver driver;

    private String userN= "demotest";
    private String userP= "qwe123";

   @BeforeMethod
   public void setup (){

       System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
       driver = new FirefoxDriver();
       driver.get("https://meta.ua");

    }
    @Test(priority = 0)
    public void LoginUserNameFail(){

        LoginPage loginpage = new LoginPage(driver);
        ResultsPage resultsPage = loginpage.login(userP, userP);
        Assert.assertEquals(resultsPage.getfailmessage(), "Введенный пароль неверен", "Login Failds");
    }

    @Test(priority = 1)
    public void LoginUserPasswordFail(){

        LoginPage loginpage = new LoginPage(driver);
        ResultsPage resultsPage = loginpage.login(userN, userN);
        Assert.assertEquals(resultsPage.getfailmessage(), "Введенный пароль неверен", "Login Failds");
    }

    @Test(priority = 2)
    public void LoginUserSuccess() {

        LoginPage loginpage = new LoginPage(driver);

        ResultsPage resultsPage = loginpage.login(userN, userP);
       Assert.assertEquals(resultsPage.getSendMail(), "Написати листа    ", "User name does not match");
    }
    @Test(priority = 3)
    public void CheckMail(){
        LoginPage loginpage = new LoginPage(driver);
        ResultsPage resultsPage = loginpage.login(userN, userP);
        resultsPage.OpenMail();
        System.out.println("************SEND MAIL**************" + resultsPage.getTextMail()+ "******");
        Assert.assertTrue(resultsPage.getTextMail().contains("Test Demo"),"User name does not found");
    }
    @AfterMethod
    public void afterClass()
    {
        driver.quit();
    }
}

