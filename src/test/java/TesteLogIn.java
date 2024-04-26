import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import Pages.Homepage;
import Pages.LogIn;
import org.testng.annotations.Test;

import java.time.Duration;

public class TesteLogIn extends BaseTest {

    @org.testng.annotations.Test  //Verificare pagina
    public void checkTitlePage() {
        Homepage homepage = new Homepage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.verifyHomePage();
        Assert.assertEquals(homepage.verifyHomePage(), "Cărturești - Librărie Online - Carte Ceai Muzică Film");
    }

    @org.testng.annotations.Test  //Test Login
    public void logIn() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        login.enterPassword();
        login.clickAuthenticate();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test  //Test Login Parola Gresita
    public void logInWrongPass() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        login.wrongPassword();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.verifyWrongCredentials();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test  //Test Login Email Gresit
    public void logInWrongEmail() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.wrongEmail();
        login.enterPassword();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.verifyWrongCredentials();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test  //Test Login Fara Email
    public void loginNoEmail() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.enterPassword();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.verifyNoEmail();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test  //Test Login Fara Parola
    public void loginNoPassword() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.verifyNoPassword();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test   //Test Login Fara Email/Parola
    public void loginNoCredentials() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.verifyNoCredentials();
        Thread.sleep(3000);

    }

    @org.testng.annotations.Test // Test Logout
    public void logOut() throws InterruptedException {
        LogIn login = new LogIn(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.acceptCookies();
        login.clickLogIn();
        login.clickExistingUser();
        login.enterEmail();
        login.enterPassword();
        login.clickAuthenticate();
        Thread.sleep(1000);
        login.accountDropdown();
        login.clickLogout();
        Thread.sleep(3000);
    }
}
