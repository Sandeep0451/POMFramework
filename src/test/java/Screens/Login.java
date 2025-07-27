package Screens;


import ObjectRepo.LoginRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.security.PrivateKey;

public class Login {
    WebDriver driver;

    @BeforeTest
    public void creationOfWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void login(){
        LoginRepo loginRepo = new LoginRepo(driver);
        System.out.println("Page Title: " + driver.getTitle());
        loginRepo.usernameInput.sendKeys("Sandeep");
    }


}
