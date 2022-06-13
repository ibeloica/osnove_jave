package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//       2.zadatak
//       Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”



        driver.navigate().to("https://www.ebay.com/");
        Select drpCategory =
                new Select(driver.findElement(By.xpath("//select [contains(@id, 'gh-cat')]")));
        drpCategory.selectByVisibleText("Crafts");
    }
}
