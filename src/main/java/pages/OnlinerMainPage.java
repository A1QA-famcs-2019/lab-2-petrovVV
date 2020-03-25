package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlinerMainPage {
    private static WebElement loginBtn = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-bar__item--text')]"));

    public static boolean isPresent() {
        return loginBtn!=null;
    }

    public void clickLogIn() {
        loginBtn.click();
    }
}
