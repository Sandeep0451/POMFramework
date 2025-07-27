package Screens;

import CustomeMethods.CustomeElements;
import ObjectRepo.AdminRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminScreen {

    WebDriver driver;
    AdminRepo adminRepo;
    WebDriverWait wait;


    public AdminScreen(WebDriver driver) {
        this.driver = driver;
        adminRepo = new AdminRepo(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void adminScreen(){

        CustomeElements.click(wait,adminRepo.tabAdmin);
    }

}
