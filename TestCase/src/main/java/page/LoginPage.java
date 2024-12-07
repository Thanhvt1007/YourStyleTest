package page;

import base.BaseSetup;
import org.openqa.selenium.*;
import untils.WaitFor;

import java.time.Duration;

public class LoginPage {
    static WebDriver driver;

    static String inputUserName = "//input[@name='username']";
    static String inputPassword = "//input[@name='password']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void login(String username, String password) {
        try {
            WebElement ipUserName = WaitFor.waitElementVisible(driver, By.xpath(inputUserName));
            ipUserName.sendKeys(username);
            WebElement ipPassWord = WaitFor.waitElementVisible(driver, By.xpath(inputPassword));
            ipPassWord.sendKeys(password);
            ipPassWord.sendKeys(Keys.ENTER);
            Thread.sleep(10000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
