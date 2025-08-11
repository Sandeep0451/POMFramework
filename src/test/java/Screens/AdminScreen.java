package Screens;

import CustomeMethods.CustomeElements;
import ObjectRepo.AdminRepo;
import ObjectRepo.AddUserAdminRepo;
import Utility.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class AdminScreen {

    WebDriver driver;
    AdminRepo adminRepo;
    WebDriverWait wait;
    AddUserAdminRepo addUserAdminRepo;
    Map<String, String> testData;


    public AdminScreen(WebDriver driver, String testCaseName,String excelPath) {
        this.driver = driver;
        adminRepo = new AdminRepo(driver);
        addUserAdminRepo = new AddUserAdminRepo(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String screenName = "Admin";
        testData = ExcelReader.getDataForTestCase(excelPath, screenName, testCaseName);
    }
    public void adminScreen() throws InterruptedException {

        CustomeElements.click(wait,adminRepo.tabAdmin);
        CustomeElements.dataClick(wait,addUserAdminRepo.addButton,testData.get("BTN_AddUser"));
        CustomeElements.click(wait,addUserAdminRepo.selectUserRole);
        CustomeElements.click(wait,addUserAdminRepo.selectRole(testData.get("DD_UserRole")));


        CustomeElements.click(wait,addUserAdminRepo.txtStatus);
        CustomeElements.click(wait,addUserAdminRepo.selectStatus(testData.get("DD_Status")));
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Username"), addUserAdminRepo.txtUsername);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Password"), addUserAdminRepo.txtPassword);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_Password"), addUserAdminRepo.txtConfirmPassword);
        CustomeElements.sendKeysOrValidate(wait,testData.get("TXT_EmployeeName"), addUserAdminRepo.employeeName);
        CustomeElements.click(wait,addUserAdminRepo.employeeNameOptions);
        CustomeElements.click(wait,addUserAdminRepo.btnSave);

    }

}
