package Task1;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;
    @FindBy(id = "nav-cart")
    WebElement cartButton;
//    @FindBy(xpath = "//div[@id= \"nav-xshop\"]//a[1]")
    @FindBy(linkText = "Today's Deals")
    WebElement todayDeals;
    public void searchFor(String text) {
        sendKeys(searchBox, text);
        click(searchButton);
    }
    public void clickOnCart()
    {
        click(cartButton);
    }
    public void clickOnTodayDeals()
    {
        try {
            clickWithClickableWait(todayDeals);
        }
        catch (Exception e)
        {
            // Element is not clickable due to a pop-up that appears (overlay)
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", todayDeals);
        }
    }

}
