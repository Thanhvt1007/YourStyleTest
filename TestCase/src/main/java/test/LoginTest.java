package test;

import base.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public static void loginByAdmin()throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("guest", "123456");
    }


}
