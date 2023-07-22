package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    private static final By EMAIL_AREA = By.id("email");
    private static final String EMAIL = "seleniumwd.template@gmail.com";
    private static final By PASSWORD_AREA = By.id("password");
    private static final String PASSWORD = "seleniumwd1";

    private final By LOGIN_BUTTON = new By.ByCssSelector("#loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException {

        WebElement element = driver.findElement(LOGIN_BUTTON);
        element.click();
        Thread.sleep(2000);

        WebElement emailArea = driver.findElement(EMAIL_AREA);
        emailArea.sendKeys(EMAIL);

        WebElement passwordArea = driver.findElement(PASSWORD_AREA);
        passwordArea.sendKeys(PASSWORD);

        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
    }
}