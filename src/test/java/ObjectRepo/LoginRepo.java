package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepo {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnLogin;


    public LoginRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ✅ THIS IS REQUIRED
    }

}
