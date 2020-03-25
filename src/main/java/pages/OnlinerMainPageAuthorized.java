package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//a[contains(@class, 'js-toggle-bar') and contains(@class, 'b-top-profile__preview')]
/**
 * Class for interacting with onliner's main page as authorized user
 */
public class OnlinerMainPageAuthorized {

    private static WebElement menuButton = Browser.getDriver().findElement(By.xpath("//a[contains(@class, 'js-toggle-bar') and contains(@class, 'b-top-profile__preview')]"));
    private WebElement logoutButton = Browser.getDriver().findElement(By.xpath("//div[@class='b-top-profile__header']//div[@class='b-top-profile__logout']//a[contains(@class, 'b-top-profile__link')]"));

    public static boolean isMenuButtonPresent() {
        return menuButton!=null;
    }

    public void  clickMenuButton() {
        menuButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

}
