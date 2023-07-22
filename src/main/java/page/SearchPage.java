package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {

    public WebDriver driver;

    private static final By SEARCH_DATA = By.id("searchData");
    private static final By SEARCH_BUTTON = new By.ByCssSelector(".searchBtn");
    private static final By SEARCH_PAGE = By.xpath("//a[text()='2']");
    private static final By SELECT_PRODUCT = new By.ByCssSelector("#p-448159760 > div.pro > a > img");
    private static final By SKIP_ADD = new By.ByCssSelector("body > div.seg-popup.seg-middle-center.segFadeInUp.fancybox-segmentify > span");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search() throws InterruptedException {
        WebElement SendProduct = driver.findElement(SEARCH_DATA);
        WebElement SearchProduct = driver.findElement(SEARCH_BUTTON);

        SendProduct.sendKeys("Bilgisayar");
        SearchProduct.click();
        Thread.sleep(2000);
    }

    public void navigateSearchPage() throws InterruptedException {
        WebElement GoSecondPage = driver.findElement(SEARCH_PAGE);

        GoSecondPage.click();
        Thread.sleep(2000);
    }

    public void selectProduct() throws InterruptedException {
        List<WebElement> elements = driver.findElements(SELECT_PRODUCT);

        int rand = (int) (Math.random() * elements.size() + 1);
        System.out.println("Ürünlerdeki " + rand + ". ürün sepete eklendi.");
        elements.get(rand).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement element = driver.findElement((By) elements);
        element.click();
        Thread.sleep(2000);

        WebElement webElement = driver.findElement(SKIP_ADD);
        webElement.click();
    }
}