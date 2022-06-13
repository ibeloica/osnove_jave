package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


import java.util.List;

public class Zadatak3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        3.Zadatak
//        Napisati program koji:
//        Ucitava stranicu  https://www.ebay.com/
//        Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
//        Zatim bira random element iz niza opcija koristeci Random.
//                Vodite racuna da random element bude u opsegu broja elemenata niza. Random podsetnik
//        Selektuje random kategoriju izabranu u koraku iznad
//        Zatvara pretrazivac


        driver.navigate().to("https://www.ebay.com/");
        Select dropCategory =
                new Select(driver.findElement(By.xpath("//select [contains(@id, 'gh-cat')]")));
        List<WebElement> options = dropCategory.getOptions();

        Random random = new Random();
        int randomIndex = random.nextInt(options.size());
        dropCategory.selectByIndex(randomIndex);
        driver.quit();

    }
}

