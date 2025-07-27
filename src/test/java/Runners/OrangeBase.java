package Runners;

import CustomeMethods.CustomeElements;
import ObjectRepo.LoginRepo;
import Regressions.FirstRegression;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeBase {

    WebDriver driver;



    @BeforeTest
    public void creationOfWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().fullscreen();
    }

    @Test
    public void login(){
        FirstRegression firstReg = new FirstRegression(driver);
        firstReg.firstRegression_01();

    }
}
