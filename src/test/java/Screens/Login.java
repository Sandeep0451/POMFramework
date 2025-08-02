package Screens;


import CustomeMethods.CustomeElements;
import ObjectRepo.LoginRepo;
import Utility.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class Login {
    WebDriver driver;
    LoginRepo loginRepo;
    WebDriverWait wait;
    Map<String, String> testData;

    public Login(WebDriver driver, String testCaseName,String excelPath) {
        this.driver = driver;
        loginRepo = new LoginRepo(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String screenName = "Login";
        testData = ExcelReader.getDataForTestCase(excelPath, screenName, testCaseName);
    }
    public void loginScreen(){

        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Username"), loginRepo.txtUsername);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Password"), loginRepo.txtPassword);
        CustomeElements.click(wait,loginRepo.btnLogin);
    }


}
