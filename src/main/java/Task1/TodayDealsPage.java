package Task1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodayDealsPage extends BasePage{
    public TodayDealsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@aria-labelledby=\"see-more-departments-label\"]")
    WebElement seeMoreElement;
    @FindBy(xpath ="//span[@class=\"a-label a-radio-label\"]//span[text()=\"Grocery & Gourmet Food\"]")
    WebElement groceryElement;
    @FindBy(xpath = "//span[@class=\"a-label a-radio-label\"]//span[text()=\"10% off or more\"]")
    WebElement discount10Element;
    @FindBy(xpath = "//div[@data-testid=\"B0CQ7BJ1RR\"]")
    WebElement ProductElement;
    public void clickOnSeeMore()
    {
        clickWithClickableWait(seeMoreElement);
    }
    public void clickOnGrocery()
    {
        click(groceryElement);
    }
    public void clickOnDiscount()
    {
        try {
            clickWithClickableWait(discount10Element);
        }
        catch (Exception e)
        {
            // Element is not clickable because it should scroll down to the element
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", discount10Element);
        }
    }
    public void clickOnProduct()
    {
        click(ProductElement);
    }
}
