package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserAdminRepo {

    private final WebDriver driver;

    public AddUserAdminRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath = "//label[contains(text(),'User Role')]//..//..//div[@class='oxd-select-text oxd-select-text--active']" )
    public WebElement selectUserRole;

    public WebElement selectRole(String role) {
        String xpath = "//div[@class='oxd-select-option']/span[contains(text(),'" + role + "')]";
        return driver.findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    public WebElement employeeName;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --position-bottom']")
    public WebElement employeeNameOptions;


    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    public WebElement txtStatus;

    public WebElement selectStatus(String status) {
        String xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div/span[contains(text(),'" + status + "')]";
        return driver.findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//label[contains(text(),'Username')]//..//following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement txtUsername;

    @FindBy(xpath = "(//label[contains(text(),'Password')]//..//following-sibling::div//input[@class='oxd-input oxd-input--active'])[1]")
    public WebElement txtPassword;

    @FindBy(xpath = "//label[contains(text(),'Confirm Password')]//..//following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement txtConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnSave;

}
