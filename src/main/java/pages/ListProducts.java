package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ListProducts {

    private static String menuItemsXpath = "//li[contains(@class, 'project-navigation__item')]";
    private WebElement menuButton;
    public static int getRandomSection() {
        int listItems = Browser.getDriver().findElements(By.xpath(menuItemsXpath)).size();
        return new Random().nextInt(listItems);
    }

    public static String getSectionText(int sectionIndex) {
        String locator = menuItemsXpath + String.format("[%d]", sectionIndex) + "//a[contains(@class, 'project-navigation__link')]" + "//span[@class='project-navigation__sign']";
        return Browser.getDriver().findElement(By.xpath(locator)).getText();
    }

    public void clickSection(int sectionIndex) {
        String locator = menuItemsXpath + String.format("[%d]", sectionIndex) + "//span[@class='project-navigation__sign']";
        menuButton=Browser.getDriver().findElement(By.xpath(locator));
        menuButton.click();
    }
}
