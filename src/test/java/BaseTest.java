import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        // set resolution to 1024x768px
        driver.manage().window().setSize(new Dimension(1024, 768));
//        driver.manage().window().maximize();
    }
}
