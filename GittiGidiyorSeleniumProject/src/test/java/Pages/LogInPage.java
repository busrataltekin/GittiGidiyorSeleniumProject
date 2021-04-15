package Pages;
import Test.BaseTest;
import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Constants;


public class LogInPage {
    WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    //Entering UserName Input
    public void setUserName(CharSequence strUserName){
        driver.findElement(By.name("kullanici")).sendKeys(strUserName);
    }

    //Password input'una giriþ yapma
    public void setPassword(String strPassword){
        driver.findElement(By.name("sifre")).sendKeys(strPassword);
    }

    //Giriþ yap butonuna týklama
    public void clickLogin(){
        driver.findElement(By.name("pass")).submit();
    }

    public void LoginMethod(CharSequence strUserName,String strPassword){
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();

    }
}


