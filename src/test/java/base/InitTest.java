package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.BasketPage;
import page.ControlPage;
import page.LoginPage;
import page.SearchPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class InitTest {

    public WebDriver driver;
    public ControlPage controlPage;
    public LoginPage loginPage;
    public SearchPage searchPage;
    public BasketPage basketPage;

    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();

        controlPage = new ControlPage(driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        basketPage = new BasketPage(driver);
    }

    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("Driver is not running!");
        }
    }
}