import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String;
import Task1.*;

public class TaskOne extends BaseTest{
    String searchText = "car accessories";
    @Test
    public void Scenario1() {
        HomePage homePage = new HomePage(driver);
        homePage.searchFor(searchText);

        ProductOverViewPage productOverViewPage = new ProductOverViewPage(driver);
        String expectedTitle = productOverViewPage.getFirstProductTitle();
        productOverViewPage.clickFirstProduct();

        new ProductDetailsPage(driver).clickAddToCart();
        homePage.clickOnCart();

        String actualTitle = new CartPage(driver).getProductTitle().replace("…", "");
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }

    @Test
    public void Scenario2()
    {
        new HomePage(driver).clickOnTodayDeals();
        TodayDealsPage todayDealsPage = new TodayDealsPage(driver);
        todayDealsPage.clickOnSeeMore();
        todayDealsPage.clickOnGrocery();
        todayDealsPage.clickOnDiscount();
        todayDealsPage.clickOnProduct();
        new ProductDetailsPage(driver).clickAddToCart();
    }
}
