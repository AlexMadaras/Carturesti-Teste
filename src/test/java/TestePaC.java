import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import Pages.Homepage;
import Pages.LogIn;
import Pages.ProductsAndCart;
public class TestePaC extends BaseTest{
    @org.testng.annotations.Test
    public void logIn() throws InterruptedException {
        LogIn login = new LogIn(driver);
        ProductsAndCart productsAndCart = new ProductsAndCart(driver);
        Thread.sleep(1000);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.enterEmail();
        Thread.sleep(500);
        login.enterPassword();
        Thread.sleep(500);
        login.acceptCookies();
        login.clickAuthenticate();
        Thread.sleep(1000);
        productsAndCart.clickFirstProduct();
        Thread.sleep(5000);
        productsAndCart.addToCart();
        Thread.sleep(3000);
        productsAndCart.viewCart();
        Thread.sleep(1000);
        productsAndCart.deleteFromCart();
        Thread.sleep(3000);
    }
}
