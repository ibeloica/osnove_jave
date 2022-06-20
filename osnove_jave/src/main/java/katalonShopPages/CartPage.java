package katalonShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Kreirati CartPage
//        hvata delete dugme za red po indeksu
//        input za kupon
//        dugme apply coupon
//        update cart dugme
//        hvata sve redove tabele


public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDeleteButtonByRowIndex(int index) {
        return driver.findElements(By.className("remove")).get(index);
    }
//    ZABORAVIO SI INPUT KUPON!

    public WebElement getApplyCouponButton() {
        return driver.findElement(By.name("apply_coupon"));
    }

    public WebElement getUpdateCartButton() {
        return driver.findElement(By.name("update_cart"));
    }

    public WebElement getAllTableRows() {
        return driver.findElement(By.xpath("//tr [contains(@class, 'cart-item')]"));
    }
}
