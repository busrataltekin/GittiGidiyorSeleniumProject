package Pages;

import locators.Locators;
import org.junit.Assert;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Test.LogInTest;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Random;

public class PaymentPage {
    WebDriver driver;
    Logger log = Logger.getLogger(PaymentPage.class);


    public PaymentPage (WebDriver driver) {
        this.driver = driver;
    }


    public void clickPage(){
        driver.findElement(By.xpath("//*[@id=\"product_id_627050431\"]/a")).click();
    }

    public String prices() {
        driver.findElement(By.xpath("//*[@id=\"product_id_627050431\"]/a"));
        return driver.findElement(By.xpath("//*[@id=\"item-info-block-627050431\"]/div/div[1]/div[2]/div/div[1]/div/div/div[4]/p")).getText();
    }

    public void deleteProduct() throws Exception {
        driver.findElement(By.xpath("//*[@class=\"hidden-m\"]")).click();
        String empty = driver.findElement(By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2")).getText();
        try {
            if(empty.equals("Sepetinizde ürün bulunmamaktadýr.")) {
                log.info("The items deleted!");
            }else {
                log.error("The items not deleted!");
            } }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    //Selecting a product randomly
    public void SelectProduct() {
        List<WebElement> Products = driver.findElements(By.xpath(".//*[starts-with(@id, 'product_')]"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(Products.size());
        Products.get(randomProduct).click();
    }

    //Adding the product and comparising it
    public void AddtoCart() throws Exception{
        WebElement mainElement = driver.findElement(By.xpath("//*[@id=\"product_id_627050431\"]/a"));
        String product_prices = this.prices();
        Actions builder = new Actions(driver);
        builder.moveToElement(mainElement).moveToElement(driver.findElement(By.xpath("//*[@id=\"item-info-block-627050431\"]/div/div[1]/div[3]/button"))).click().perform();
        driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a")).click();
        String cart_price = driver.findElement(By.xpath("//*[@id=\"cart-price-container\"]/div[3]/p")).getText();
        try {
            if(product_prices.equals(cart_price)) {
                Assert.assertTrue(true);
            }else {
                log.error("Prices are not equal!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void AddProduct() throws Exception{
        driver.findElement(By.xpath("//*[@class=\"plus icon-plus gg-icon gg-icon-plus\"]")).click();
        String total = driver.findElement(By.className("amount")).getText();
        try {
            int i = 2;
            if(total.equals(i)) {
                Assert.assertTrue(true);
            }else {
                log.error("amount is not 2!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}