import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String;
import Task1.*;
public class TaskOne extends BaseTest{
    String searchText = "car accessories";

    @Test
    public void Scenario1() {
        HomePage homePage = new HomePage(driver);
        ProductOverViewPage productOverViewPage = new ProductOverViewPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.searchFor(searchText);
        String expectedTitle = productOverViewPage.getFirstProductTitle();
        productOverViewPage.clickFirstProduct();
        productDetailsPage.clickAddToCart();
        homePage.clickOnCart();
        String actualTitle = cartPage.getProductTitle();
        // To avoid the issue which is caused when comparing the full title with the expected title
        String actualTitleSplitted = actualTitle.split(",")[0];
        String expectedTitleSplitted = expectedTitle.split(",")[0];
        Assert.assertTrue(actualTitleSplitted.contains(expectedTitleSplitted));
    }
    @Test
    public void Scenario2()
    {
        HomePage homePage = new HomePage(driver);
        TodayDealsPage todayDealsPage = new TodayDealsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        homePage.clickOnTodayDeals();
        todayDealsPage.clickOnSeeMore();
        todayDealsPage.clickOnGrocery();
        todayDealsPage.clickOnDiscount();
        todayDealsPage.clickOnProduct();
        productDetailsPage.clickAddToCart();
    }
}
