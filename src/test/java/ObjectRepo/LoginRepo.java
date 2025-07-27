package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepo {

    WebDriver driver;

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement usernameInput;


    public LoginRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ✅ THIS IS REQUIRED
    }

}
