package Regressions;

import Screens.AdminScreen;
import Screens.Login;
import Screens.PIMScreen;
import org.openqa.selenium.WebDriver;

public class FirstRegression {

    public Login loginScreen;
    public AdminScreen adminScreen;
    public PIMScreen PIMscreen;
    public FirstRegression(WebDriver driver, String testCaseName, String excelPath) {
        loginScreen = new Login(driver,testCaseName,excelPath);
        adminScreen = new AdminScreen(driver,testCaseName,excelPath);
        PIMscreen = new PIMScreen(driver,testCaseName,excelPath);
    }

    public void firstRegression_01() throws InterruptedException {
        loginScreen.loginScreen();
        //adminScreen.adminScreen();
        PIMscreen.PIMScreenActions();
    }
}
