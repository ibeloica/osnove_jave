package p09_06_2022_SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {

//        4.Zadatak
//        Napisti proram koji :
//        Ucitava stranicu https://s.bootsnipp.com/iframe/oV91g
//        Hvatamo sve page-eve iz paginacije tabele
//        Zatim petljom prolazimo kroz paginaciju tako sto kliknemo na svaki broj
//        Izmedju iteracija napravite pauzu od 1s
//        Zatvorite pretrazivac

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://s.bootsnipp.com/iframe/oV91g");

        List<WebElement> paginatori =
                driver.findElements(By.xpath("//a [contains(@class, 'page')]"));


        for (int i = 0; i < paginatori.size(); i++) {
            paginatori.get(i).click();
            Thread.sleep(1000);

        }
        driver.quit();


    }
}
