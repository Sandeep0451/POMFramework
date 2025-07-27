package CustomeMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomeElements {
    WebDriver driver;

    public static void sendKeysOrValidate(WebDriverWait wait, String data, WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(data);
    }

    public static void selectElement(WebDriverWait wait, String data, WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Select sel = new Select(element);
        sel.selectByValue(data);
    }

    public static void click(WebDriverWait wait, WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
}
