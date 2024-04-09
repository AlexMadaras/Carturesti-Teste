import org.testng.Assert;
import Pages.Homepage;
import Pages.LogIn;

public class TesteLogIn extends BaseTest {
    @org.testng.annotations.Test
    public void checkTitlePage(){
        Homepage homepage = new Homepage(driver);
        homepage.verifyHomePage();
        Assert.assertEquals(homepage.verifyHomePage(),"Cărturești - Librărie Online - Carte Ceai Muzică Film");
    }
    @org.testng.annotations.Test
    public void logIn() throws InterruptedException {
        LogIn login = new LogIn(driver);
        Thread.sleep(3000);
        login.clickLogIn();
        Thread.sleep(3000);
        login.clickExistingUser();
        Thread.sleep(3000);
        login.enterEmail();
        Thread.sleep(1000);
        login.enterPassword();
        Thread.sleep(1000);
        login.clickAuthenticate();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test
    public void logInWrongPass() throws InterruptedException {
        LogIn login = new LogIn(driver);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.enterEmail();
        Thread.sleep(1000);
        login.wrongPassword();
        Thread.sleep(1000);
        login.clickAuthenticate();
        Thread.sleep(3000);
        login.verifyWrongCredentials();
        Thread.sleep(1000);
    }
    @org.testng.annotations.Test
    public void logInWrongEmail() throws InterruptedException{
        LogIn login = new LogIn(driver);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.wrongEmail();
        Thread.sleep(500);
        login.enterPassword();
        Thread.sleep(500);
        login.clickAuthenticate();
        Thread.sleep(3000);
        login.verifyWrongCredentials();
        Thread.sleep(1000);
    }
    @org.testng.annotations.Test
    public void loginNoEmail() throws InterruptedException{
        LogIn login = new LogIn(driver);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.enterPassword();
        Thread.sleep(500);
        login.clickAuthenticate();
        Thread.sleep(3000);
        login.verifyNoEmail();
        Thread.sleep(1000);
    }
    @org.testng.annotations.Test
    public void loginNoPassword() throws InterruptedException{
        LogIn login = new LogIn(driver);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.enterEmail();
        Thread.sleep(1000);
        login.clickAuthenticate();
        Thread.sleep(3000);
        login.verifyNoPassword();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test
    public void loginNoCredentials() throws InterruptedException{
        LogIn login = new LogIn(driver);
        login.clickLogIn();
        Thread.sleep(1000);
        login.clickExistingUser();
        Thread.sleep(1000);
        login.clickAuthenticate();
        Thread.sleep(3000);
        login.verifyNoCredentials();
        Thread.sleep(3000);

    }

}
