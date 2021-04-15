package locators;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Locators  {

 By UserName = (By.name("kullanici"));
 By Password = (By.name("sifre"));
 By login = (By.name("pass"));
 By PopUp = (By.cssSelector("\"[title=\\\"Giriş Yap\\\"]\""));
 By btnLogIn = (By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div[1]/div[3]/div/div[1]/div"));
 By giris = (By.xpath("//*[@class=\"gekhq4-4 hwMdSM\"]"));
 By product = By.xpath("//*[@id=\"product_id_627050431\"]/a");
 By cart = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a");
 By price = By.xpath("//*[@id=\"item-info-block-627050431\"]/div/div[1]/div[2]/div/div[1]/div/div/div[4]/p");
 By cartPrice = By.xpath("//*[@id=\"cart-price-container\"]/div[3]/p");
 By plus = By.xpath("//*[@class=\"plus icon-plus gg-icon gg-icon-plus\"]");
 By delete = By.xpath("//*[@class=\"hidden-m\"]");
 By amount = By.className("amount");
 By x = By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2");


}
