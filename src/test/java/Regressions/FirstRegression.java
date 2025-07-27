package Regressions;

import Screens.AdminScreen;
import Screens.Login;
import org.openqa.selenium.WebDriver;

public class FirstRegression {

    public Login loginScreen;
    public AdminScreen adminScreen;
    public FirstRegression(WebDriver driver, String testCaseName, String excelPath) {
        loginScreen = new Login(driver,testCaseName,excelPath);
        adminScreen = new AdminScreen(driver);
    }

    public void firstRegression_01() {
        loginScreen.loginScreen();
        adminScreen.adminScreen();
    }
}
