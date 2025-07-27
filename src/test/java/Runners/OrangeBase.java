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
    public String excelPath = "/home/sandeepthadoju/Automation/POMFramework/testData/TestData.xlsx";


    @BeforeTest
    public void creationOfWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    public void login(){
        String testCaseName = "TC_001";
        FirstRegression firstReg = new FirstRegression(driver,testCaseName,excelPath);
        firstReg.firstRegression_01();

    }
}
