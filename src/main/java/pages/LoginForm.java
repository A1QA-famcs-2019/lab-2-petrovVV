package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private WebElement loginTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"text\"]"));
    private WebElement passwordTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"password\"]"));
    private WebElement loginButton = Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'auth-form__control')]//button[@type='submit']"));

    public void login() {
        loginTextField.sendKeys("petrou.valiancin@gmail.com");
        passwordTextField.sendKeys("2000Dfktynby1905");
        loginButton.click();
        final WebElement userAvatar = Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'b-top-profile__image js-header-user-avatar')]"));
    }

}
