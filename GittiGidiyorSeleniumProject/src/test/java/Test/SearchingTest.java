package Test;
import locators.Locators;
import org.junit.Test;

import Pages.LogInPage;
import Pages.SearchingPage;
import Pages.PaymentPage;
import org.openqa.selenium.By;
import util.Constants;

public class SearchingTest extends BaseTest {

    //giriþ yapma, arama,2.sayfa açýlýþý, ürün seçme, sepete ekleme,fiyat karþýlaþtýrma,ürün sayýsýný arttýrma, ürünü silme iþlemlerinin testi burda gerçekleþiyor.
    @Test
    public void Search() throws Exception {

        new LogInPage(driver).LoginMethod(Constants.testUsername, Constants.testPassword);
        new SearchingPage(driver).sendInput("bilgisayar");
        new SearchingPage(driver).performPage();

    }
}