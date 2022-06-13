package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        1.Zad
//        Napisati program koji:
//        Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//        Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika
//        element obrisao sa stranice i ispisuje odgovarajuce poruke
//        (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//        POMOC: Brisite elemente odozdo.
//        (ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

        driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
        for (int i = 0; i <= 5; i++) {
            driver.findElement(By.xpath("/html/body/div/div/div/div[last()]/button")).click();



//            Za vezbanje:
//            for (int i = 0; i <= 5; i++) {
//                driver.findElement(By.xpath("/html/body/div/div/div/div[1]/button")).click();


        }


    }
}
