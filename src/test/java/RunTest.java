import base.InitTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RunTest extends InitTest {

    @Test
    @Order(1)
    public void controlPageTest() {
        controlPage.urlControl();
    }

    @Test
    @Order(2)
    public void loginPageTest() throws InterruptedException {
        loginPage.login();
    }

    @Test
    @Order(3)
    public void searchPageTest() throws InterruptedException {
        searchPage.search();
        searchPage.navigateSearchPage();
        searchPage.selectProduct();
    }

    @Test
    @Order(4)
    public void basketPageTest() throws InterruptedException {
        basketPage.addToBasket();
        basketPage.goToBasket();
        basketPage.productIncrease();
        basketPage.clearBasket();
        basketPage.controlBasket();
    }
}