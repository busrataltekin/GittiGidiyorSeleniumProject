package Pages;
import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;

public class BasePage {
WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void LogIn() {

            WebElement mainElement = driver.findElement((By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div[1]/div[3]/div/div[1]/div")));
            Actions builder = new Actions(driver);
            builder.moveToElement(mainElement).moveToElement(driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div/div[2]"))).perform();
            builder.build().perform();
            driver.findElement(By.name("pass")).click();
        driver.findElement(By.xpath("//*[@class=\"gekhq4-4 hwMdSM\"]")).click();
/*
        driver.get("https://www.gittigidiyor.com");
        driver.findElement(By.cssSelector("[title=\"Giriş Yap\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-cy=\"header-login-button\"]"));
        sign.click();
*/
  }

}