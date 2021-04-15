package Test;
import Pages.BasePage;
import Pages.LogInPage;
import org.junit.Test;
import Pages.PaymentPage;
import util.Constants;


public class PaymentTest extends BaseTest {
    @Test
    public void payment() throws Exception {
        navigateUrl(Constants.BasePageUrl);
        new BasePage(driver).LogIn();
        new PaymentPage(driver).SelectProduct();
        new PaymentPage(driver).AddtoCart();
        new PaymentPage(driver).AddProduct();
        new PaymentPage(driver).deleteProduct();

    }
}
