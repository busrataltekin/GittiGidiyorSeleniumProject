
package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        setProperty();
        driver = new ChromeDriver();

        /* To maximize the browser window
         */
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
/* At first, setProperty works,
Then process continues
 */
    public static void setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
    }

    public void navigateUrl(String url) {
        driver.get(url);

    }
}


