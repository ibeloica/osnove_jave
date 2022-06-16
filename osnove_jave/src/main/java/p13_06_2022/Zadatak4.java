package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        4.Zadatak
//        Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV
//        // i ceka da se ucita progress bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”

        driver.get("https://s.bootsnipp.com/iframe/klDWV");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div [contains(@style, '100%')]"), "100%"));
        System.out.println("Stranica ucitana");


    }
}
