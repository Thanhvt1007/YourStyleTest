package page;

import base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import untils.WaitFor;

import java.time.Duration;

public class LoginPage {
    static WebDriver driver;

    static String inputUserName = "//input[@name='username']";
    static String inputPassword = "//input[@name='password']";
    static String btnLogin = "//button[text()='Đăng Nhập']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void login(String username, String password) throws Exception {
//        WebElement ipUserName = WaitFor.waitElementVisible(driver, By.xpath(inputUserName));
//        ipUserName.sendKeys(username);
//        WebElement ipPassWord = WaitFor.waitElementVisible(driver, By.xpath(inputPassword));
//        ipPassWord.sendKeys(password);
//        WebElement buttonLogin = WaitFor.waitElementVisible(driver, By.xpath(btnLogin));
//        buttonLogin.click();
        WebElement ipUserName = driver.findElement(By.xpath(inputUserName));
        ipUserName.sendKeys(username);
        WebElement ipPassWord = driver.findElement(By.xpath(inputPassword));
        ipPassWord.sendKeys(password);
        WebElement buttonLogin = driver.findElement(By.xpath(btnLogin));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonLogin);
        Thread.sleep(5000);
        buttonLogin.click();
        Thread.sleep(5000);
    }

}
