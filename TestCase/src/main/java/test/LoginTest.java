package test;

import base.BaseSetup;
import base.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public static void loginByAdmin() {
        LoginPage loginPage = new LoginPage(BaseSetup.driver);
        loginPage.login("guest", "123456");
    }


}
