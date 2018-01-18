package pageobjectdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Andrii.Kuchynskyi on 18.01.2018.
 */
public class SearchPage {
    private WebDriver driver;

    private WebElement hplogo;
    private WebElement q;
    private WebElement btnk;
    @FindBy(id = "btnI")
    private WebElement btnI;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isPageVisible(){
        try {
            return hplogo.isDisplayed();
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
    public SearchPage enterSearchText (String searchWord){
        q.sendKeys(searchWord);
        return this;
    }
    public void clickSearchButton(){
        driver.findElement(By.name("btnK")).click();
    }
    public ResultPage clickImLuckilyButton(){
        driver.findElement(By.name("btnI")).click();
        return new ResultPage(this.driver);
    }
    public ResultPage search(String searchWord){
       this.enterSearchText(searchWord);
       this.clickSearchButton();
       return new ResultPage(this.driver);
    }
    public void searchluckily(String searchWord){
        this.enterSearchText(searchWord);
        this.clickImLuckilyButton();

    }
}
