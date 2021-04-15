package Test;
import Pages.BasePage;
import Pages.LogInPage;

import locators.Locators;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Constants;


public class LogInTest extends BaseTest{

    WebDriver driver;
    Logger log = Logger.getLogger(LogInTest.class);
    String expectedTitle = "GittiGidiyor - Türkiye'nin Öncü Alýþveriþ Sitesi";

    // Opens the Homepage
    @Test
    public void Home() {
        navigateUrl(Constants.BasePageUrl);
        log.info("Completed");
    }

    @Test
    public void Login() throws Exception {


        new BasePage(driver).LogIn();
        new LogInPage(driver).LoginMethod(Constants.testUsername, Constants.testPassword);
        Assert.assertEquals(driver.getTitle(), "GittiGidiyor - Türkiye'nin Öncü Alýþveriþ Sitesi");

        try{
            Assert.assertEquals(expectedTitle, driver.getTitle());
            log.info("Correct");
        }
        catch(Throwable pageNavigationError){
            log.error("Fail");
        }
    }
}