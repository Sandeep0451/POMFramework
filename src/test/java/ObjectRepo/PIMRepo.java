package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMRepo {

    WebDriver driver;



    @FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
    public WebElement tabPIM;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement txtFirstName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement txtMiddleName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement txtLastName;

    @FindBy(xpath = "//label[contains(text(),'Employee Id')]//..//..//input[@class='oxd-input oxd-input--active']")
    public WebElement txtEmployeeID;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    public WebElement chkCreateLogin;







    public PIMRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ✅ THIS IS REQUIRED
    }
}
