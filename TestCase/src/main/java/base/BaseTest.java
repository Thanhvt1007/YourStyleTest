package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setUp() {
        BaseSetup.setupDriver();
    }

    @AfterMethod
    public void tearDown() {
       BaseSetup.driver.quit();
    }

}
