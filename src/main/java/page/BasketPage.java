package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {

    public WebDriver driver;

    private static final By ADD_TO_CART = new By.ByCssSelector("a[class='btn btnGrey btnAddBasket']");
    private static final By GO_TO_CART = new By.ByCssSelector(".myBasket ");
    private static final By AGREEMENT_TEXT = new By.ByCssSelector("[class='btn btnBlack']");
    private static final By PRODUCT_INCREASE_BUTTON = new By.ByCssSelector("[class='spinnerUp spinnerArrow']");
    private static final By CLEAR_CART_BUTTON = new By.ByCssSelector("[class='removeProd svgIcon svgIcon_trash']");
    private static final By CART_DETAIL = new By.ByCssSelector("#wrapper > div.content > div > div.checkoutContainer.emptyCartContainer > div.cartEmptyText > h2");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToBasket() throws InterruptedException {
        WebElement element = driver.findElement(ADD_TO_CART);
        element.click();
        Thread.sleep(2000);
    }

    public void goToBasket() throws InterruptedException {
        WebElement element = driver.findElement(GO_TO_CART);
        element.click();
        Thread.sleep(2000);

        WebElement agreementElements = driver.findElement(AGREEMENT_TEXT);
        agreementElements.click();
        Thread.sleep(1000);
    }

    public void productIncrease() throws InterruptedException {
        WebElement element = driver.findElement(PRODUCT_INCREASE_BUTTON);
        element.click();
        Thread.sleep(1000);
    }

    public void clearBasket() throws InterruptedException {
        WebElement element = driver.findElement(CLEAR_CART_BUTTON);
        element.click();
        Thread.sleep(2000);
    }

    public void controlBasket() {
        WebElement element = driver.findElement(CART_DETAIL);
        String text = element.getText();
        System.out.println(text);
    }
}