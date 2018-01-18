package pageobjectdemo.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Andrii.Kuchynskyi on 18.01.2018.
 */
public class ResultPage {
    private WebDriver driver;
    public ResultPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean titleContains(String tralala) {
        return  driver.getTitle().contains(tralala);
    }
}
