package Regressions;

import Screens.Login;
import org.openqa.selenium.WebDriver;

public class FirstRegression {

    public Login loginScreen;

    public FirstRegression(WebDriver driver) {
        loginScreen = new Login(driver);
    }

    public void firstRegression_01() {
        loginScreen.loginScreen();
    }
}
