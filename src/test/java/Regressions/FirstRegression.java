package Regressions;

import Screens.AdminScreen;
import Screens.Login;
import org.openqa.selenium.WebDriver;

public class FirstRegression {

    public Login loginScreen;
    public AdminScreen adminScreen;
    public FirstRegression(WebDriver driver) {
        loginScreen = new Login(driver);
        adminScreen = new AdminScreen(driver);
    }

    public void firstRegression_01() {
        loginScreen.loginScreen();
        adminScreen.adminScreen();
    }
}
