package katalonShopTests;

import katalonShopPages.CartPage;
import katalonShopPages.NavPage;
import katalonShopPages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class KatalonShopTests {

    public WebDriver driver;

    private String baseUrl = "https://cms.demo.katalon.com/";

    private CartPage cartPage;
    private ProductPage productPage;
    private NavPage navPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navPage = new NavPage(driver);
        cartPage = new CartPage(driver);
        productPage = new ProductPage(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 1)
//    Adding product with quantity to the cart
    public void addingProductsToTheCart() {
        driver.get(baseUrl + "/product/flying-ninja/");
        productPage.getQuantityInput().clear();
        productPage.getQuantityInput().sendKeys("3");
        productPage.getAddToCartButton().click();
        Assert.assertTrue(productPage.getAddedToCartMessage().getText().contains("Flying Ninja"));
        navPage.getCartLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/cart/"));

    }


    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
    }
}
