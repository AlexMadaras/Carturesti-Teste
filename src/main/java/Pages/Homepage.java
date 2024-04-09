package Pages;

import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {this.driver = driver;}
    public String verifyHomePage() {return driver.getTitle();}
}
