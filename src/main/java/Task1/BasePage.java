package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void explicitWaitCondition(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds((30)));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void explicitWaitClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds((30)));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void click(WebElement element) {
        explicitWaitCondition(element);
        element.click();
    }
    public void clickWithClickableWait(WebElement element) {
        explicitWaitClickable(element);
        element.click();
    }
    public void sendKeys(WebElement element, String text) {
        explicitWaitCondition(element);
        element.sendKeys(text);
    }
}
