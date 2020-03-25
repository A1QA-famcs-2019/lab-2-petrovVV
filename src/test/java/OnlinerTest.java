import driver.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class OnlinerTest {

    @BeforeMethod
    public void setUp() {

        Browser.getDriver().manage().window().maximize();
        Browser.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Browser.getDriver().get("http://onliner.by/");
    }

    @Test
    public void onlinerTest() {
        WebDriver driver = Browser.getDriver();
        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.clickLogIn();

        Assert.assertTrue(OnlinerMainPage.isPresent(),"Unauthorized page should have 'login button'");

        LoginForm loginForm = new LoginForm();
        loginForm.login();

        OnlinerMainPageAuthorized onlinerMainPageAuthorized = new OnlinerMainPageAuthorized();
        Assert.assertTrue(OnlinerMainPageAuthorized.isMenuButtonPresent(),"Authorized page should have 'logout button'");

        ListProducts products = new ListProducts();
        int sectionIdx = products.getRandomSection();
        String sectionLinkText = products.getSectionText(sectionIdx);

        products.clickSection(sectionIdx);
        ProductPage sectionPage = new ProductPage();
        Assert.assertEquals(sectionLinkText, sectionPage.getTitleText(), "Link and page title should match.");

        
    }








}
