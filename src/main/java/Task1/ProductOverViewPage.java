package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOverViewPage extends BasePage{
    public ProductOverViewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    // First Item Cannot be added to the Cart.. That's Why i Chose the 3rd one
    @FindBy(xpath = "//div[@data-csa-c-pos='3']")
    WebElement firstProduct;
    @FindBy(xpath = "//div[@data-csa-c-pos='3']//h2//span")
    WebElement firstProductTitle;
    public void clickFirstProduct() {
        click(firstProduct);
    }
    public String getFirstProductTitle() {
        return firstProductTitle.getText();
    }

}
