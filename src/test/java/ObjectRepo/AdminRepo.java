package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminRepo {


    WebDriver driver;

    @FindBy(xpath = "//span[text()='Admin']")
    public WebElement tabAdmin;


    public AdminRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
