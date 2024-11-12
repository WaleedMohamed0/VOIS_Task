package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//span[@class='a-truncate-cut' and @style='height: 2.6em;'])")
    WebElement productTitle;
    public String getProductTitle() {
        return productTitle.getText();
    }
}
