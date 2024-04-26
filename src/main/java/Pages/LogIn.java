package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import com.google.common.base.Verify;

public class LogIn {
    private WebDriver driver;
    public LogIn(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogIn(){
        WebElement buttonLogIn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/md-menu-bar[2]/md-menu-item[3]/button/span"));
        buttonLogIn.click();
    }
    public void clickExistingUser(){
        WebElement buttonExistingUser = driver.findElement(By.id("loginTrigger"));
        buttonExistingUser.click();
    }
    public void enterEmail(){
        WebElement fieldEmail = driver.findElement(By.id("loginform-email"));
        fieldEmail.sendKeys("madarasalexandru2@gmail.com");
    }
    public void enterPassword(){
        WebElement fieldPassword = driver.findElement(By.id("loginform-password"));
        fieldPassword.sendKeys("Parolatestare14");
    }
    public void clickAuthenticate(){
        WebElement buttonAuthenticate = driver.findElement(By.name("login-button"));
        buttonAuthenticate.click();
    }
    public void wrongEmail(){
        WebElement fieldEmail = driver.findElement(By.id("loginform-email"));
        fieldEmail.sendKeys("madarasalexandru3@gmail.com");
    }
    public void wrongPassword(){
        WebElement fieldPassword = driver.findElement(By.id("loginform-password"));
        fieldPassword.sendKeys("Parolatestare13");
    }
    public void verifyWrongCredentials(){
        WebElement wrongPass = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div[2]"));
        String wrongPassword = wrongPass.getText();
        assert wrongPassword.equals("Adresă de email sau parolă incorectă.");
    }
    public void verifyNoEmail(){
        WebElement noCredentials = driver.findElement(By.xpath("//*[@id=\"modalLoginForm\"]/md-input-container[1]/div[2]/div"));
        String noEmailPass = noCredentials.getText();
        assert noEmailPass.equals("Acest câmp trebuie completat.");
    }
    public void verifyNoPassword(){
        WebElement noCredentials = driver.findElement(By.xpath("//*[@id=\"modalLoginForm\"]/md-input-container[2]/div[2]/div"));
        String noEmailPass = noCredentials.getText();
        assert noEmailPass.equals("Acest câmp trebuie completat.");
    }
    public void verifyNoCredentials(){
        WebElement noCredentials = driver.findElement(By.xpath("//*[@id=\"modalLoginForm\"]/md-input-container[1]/div[2]/div"));
        WebElement noCredentials2 = driver.findElement(By.xpath("//*[@id=\"modalLoginForm\"]/md-input-container[2]/div[2]/div"));
        String noEmail = noCredentials.getText();
        String noPassword = noCredentials2.getText();
        assert noEmail.equals("Acest câmp trebuie completat.");
        assert noPassword.equals("Acest câmp trebuie completat.");
    }
    public void accountDropdown(){
        WebElement accountDropdown = driver.findElement(By.id("accountDropdown"));
        accountDropdown.click();
    }
    public void clickLogout(){
        WebElement logout = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/md-menu-bar[2]/md-menu-item[3]/ul/li[5]/a"));
        logout.click();
    }
    public void acceptCookies(){
        WebElement acceptCookies = driver.findElement(By.xpath("/html/body/div[2]/div/a[2]"));
        acceptCookies.click();
    }



    }

