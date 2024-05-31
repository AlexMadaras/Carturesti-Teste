import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import Pages.Homepage;
import Pages.LogIn;
import Pages.ProductsAndCart;

import java.time.Duration;

public class TestePaC extends BaseTest{
    @org.testng.annotations.Test // Adaugare produs in Cos
    public void addInCart() throws InterruptedException{
        LogIn login = new LogIn(driver);
        ProductsAndCart productsAndCart = new ProductsAndCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        Thread.sleep(500);
        login.enterPassword();
        login.acceptCookies();
        login.clickAuthenticate();
        Thread.sleep(1000);
        productsAndCart.clickFirstProduct();
        Thread.sleep(2000);
        productsAndCart.addToCart();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test // Stergere produs din Cos
    public void logIn() throws InterruptedException {
        LogIn login = new LogIn(driver);
        ProductsAndCart productsAndCart = new ProductsAndCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        Thread.sleep(500);
        login.enterPassword();
        login.acceptCookies();
        login.clickAuthenticate();
        Thread.sleep(1000);
        productsAndCart.clickFirstProduct();
        Thread.sleep(2000);
        productsAndCart.addToCart();
        Thread.sleep(2000);
        productsAndCart.viewCart();
        Thread.sleep(1000);
        productsAndCart.deleteFromCart();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test // Adaugare produs in Wishlist
    public void addWishlist() throws InterruptedException {
        LogIn login = new LogIn(driver);
        ProductsAndCart productsAndCart = new ProductsAndCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        Thread.sleep(500);
        login.enterPassword();
        login.acceptCookies();
        login.clickAuthenticate();
        Thread.sleep(1000);
        productsAndCart.clickFirstProduct();
        productsAndCart.addToWishlist();
        Thread.sleep(500);
        productsAndCart.chooseWishList();
        Thread.sleep(1000);
        login.accountDropdown();
        productsAndCart.goToWishlist();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test // Eliminare produs din Wishlist
    public void removeFromWishlist() throws InterruptedException{
        LogIn login = new LogIn(driver);
        ProductsAndCart productsAndCart = new ProductsAndCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        Thread.sleep(500);
        login.enterPassword();
        login.acceptCookies();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.accountDropdown();
        productsAndCart.goToWishlist();
        productsAndCart.removeFromWishlist();
        Thread.sleep(3000);
    }
}
