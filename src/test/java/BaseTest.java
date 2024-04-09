import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://carturesti.ro/?gad_source=1&gclid=EAIaIQobChMI2u7l3--UhQMVzrCDBx0IeQZSEAAYASAAEgJ0aPD_BwE");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
