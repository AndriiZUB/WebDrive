package TestMeta;

import TestMeta.pageObj.LoginPage;
import TestMeta.pageObj.ResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest {
    private WebDriver driver;
    private String username= "demotest";
    private String userpassword= "qwe123";

    @BeforeMethod
    public void setup (){
        System.setProperty("webdriver.gecko.driver","test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://meta.ua");
    }

    @Test
            //(priority = 0)
    public void LoginPageTest() {



        PageFactory.initElements(driver, LoginPage.class);
        LoginPage loginpage = new LoginPage(driver);

        ResultsPage resultsPage = loginpage.login(username, userpassword);
       // Assert.assertTrue(resultsPage.getUsername(), "demotest", "User name does not match");
        //System.out.println("************USER NAME**************" + resultsPage.getUsername() + "******");
        Assert.assertEquals(resultsPage.getUsername(), "demotest", "User name does not match");
    }

    @AfterMethod
    public void afterClass()
    {
        driver.quit();
    }
}

