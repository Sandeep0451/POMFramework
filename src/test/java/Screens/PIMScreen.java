package Screens;

import CustomeMethods.CustomeElements;
import ObjectRepo.LoginRepo;
import ObjectRepo.PIMRepo;
import Utility.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class PIMScreen {


    WebDriver driver;
    PIMRepo PIMrepo;
    WebDriverWait wait;
    Map<String, String> testData;

    public PIMScreen(WebDriver driver, String testCaseName,String excelPath) {
        this.driver = driver;
        PIMrepo = new PIMRepo(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String screenName = "PIM";
        testData = ExcelReader.getDataForTestCase(excelPath, screenName, testCaseName);
    }

    public void PIMScreenActions() throws InterruptedException {


        CustomeElements.click(wait,PIMrepo.tabPIM);
        CustomeElements.dataClick(wait,PIMrepo.addButton,testData.get("BTN_AddUser"));
        wait.until(ExpectedConditions.visibilityOf(PIMrepo.txtFirstName));

        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_FirstName"), PIMrepo.txtFirstName);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_MiddleName"), PIMrepo.txtMiddleName);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_LastName"), PIMrepo.txtLastName);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_EmployeeID"), PIMrepo.txtEmployeeID);
        CustomeElements.dataClick(wait,PIMrepo.chkCreateLogin,testData.get("CHK_CreateLogin"));

        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Username"), PIMrepo.txtCrtUsername);
        wait.until(ExpectedConditions.visibilityOf(PIMrepo.txtCrtPassword));
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Password"), PIMrepo.txtCrtPassword);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Password"), PIMrepo.txtCrtConfirmPassword);
        CustomeElements.dataClick(wait,PIMrepo.btnSave,testData.get("BTN_Save"));
        CustomeElements.verifyElementPresent(wait,PIMrepo.lblSuccessMessage,"Success");

    }
}
