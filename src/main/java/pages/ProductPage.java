package pages;


import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ProductPage {

    private WebElement sectionTitle = Browser.getDriver().findElement(By.xpath("//div[@class='schema-header']//*[@class='schema-header__title']"));

    public String getTitleText() {
        return sectionTitle.getText();
    }


}
