package katalonShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Kreirati ProductPage koja ima:
//        quantity
//        add to cart button
//        poruka o dodavanju proizvoda u korpu


public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getQuantityInput() {
        return driver.findElement(By.name("quantity"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.name("add-to-cart"));
    }

    public WebElement getAddedToCartMessage() {
        return driver.findElement(By.className("woocommerce-message"));
    }
}
