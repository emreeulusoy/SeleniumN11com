import base.InitTest;
import org.junit.jupiter.api.Test;

public class RunTest extends InitTest {

    @Test
    public void controlPageTest() {
        controlPage.urlControl();
    }

    @Test
    public void loginPageTest() throws InterruptedException {
        loginPage.login();
    }

    @Test
    public void searchPageTest() throws InterruptedException {
        searchPage.search();
        searchPage.navigateSearchPage();
        searchPage.selectProduct();
    }

    @Test
    public void basketPageTest() throws InterruptedException {
        basketPage.addToBasket();
        basketPage.goToBasket();
        basketPage.productIncrease();
        basketPage.clearBasket();
        basketPage.controlBasket();
    }
}