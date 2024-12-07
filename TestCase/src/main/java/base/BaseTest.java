package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import untils.ReadConfig;

public class BaseTest {
   public static WebDriver driver;

    @BeforeMethod
    public void setUp() {
//        BaseSetup.setupDriver();
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/yourstyle/accounts/login");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }

}
