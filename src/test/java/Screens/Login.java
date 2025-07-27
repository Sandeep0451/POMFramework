package Screens;


import CustomeMethods.CustomeElements;
import ObjectRepo.LoginRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.security.PrivateKey;
import java.time.Duration;

public class Login {
    WebDriver driver;
    LoginRepo loginRepo;
    WebDriverWait wait;


    public Login(WebDriver driver) {
        this.driver = driver;
        loginRepo = new LoginRepo(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void loginScreen(){

        CustomeElements.sendKeysOrValidate(wait,"Admin", loginRepo.txtUsername);
        CustomeElements.sendKeysOrValidate(wait, "admin123", loginRepo.txtPassword);
        CustomeElements.click(wait,loginRepo.btnLogin);
    }


}
