package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ControlPage {

    public WebDriver driver;

    private static final String BROWSER = "https://www.n11.com/";

    public ControlPage(WebDriver driver) {
        this.driver = driver;
    }

    public void urlControl() {
        Assertions.assertEquals(BROWSER, driver.getCurrentUrl(), "Error occured : Wrong URL !");
    }
}
