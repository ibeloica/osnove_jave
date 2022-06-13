package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//        Zadatak
//        Napisati program koji vrsi dodavanje 5 reda u tabelu.
//                Maksimizirati prozor
//        Ucitati stranicu
//        https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//        Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
//        Klik na dugme Add New
//        Unesite name,departmant i phone (uvek iste vrednost)
//        Trazenje po name atributu
//        Kliknite na zeleno Add dugme.
//                PAZNJA: Pogledajte strukturu stranice i videcete
//        da se u svakom redu poslednje kolone javljaju dugmici edit, add, delete
//        ali zbog prirode reda neki dugmici se vide a neki ne.
//                Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele.
//                Mozete koristeci index iz petlje, a mozete koristeci i last() fukncionalnost za xpath.
//                Koristan link last mehnizma
//        Cekanje od 0.5s
//        Na kraju programa ugasite pretrazivac


        driver.navigate().to
                ("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
        driver.manage().window().maximize();
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                driver.findElement(By.xpath("//button [contains(@class, 'add-new' )]")).click();
                driver.findElement(By.xpath("//input [contains(@id, 'name')]")).sendKeys("Aca Kurcubic");
                driver.findElement(By.xpath("//input [contains(@id, 'department')]")).sendKeys("HR poltron");
                driver.findElement(By.xpath("//input [contains(@id, 'phone')]")).sendKeys("064245");
                driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[4]/td[4]/a[1][last()]")).click();
                driver.findElement(By.xpath("//button [contains(@class, 'add-new' )]")).click();

            }
            if (i > 1) {
                driver.findElement(By.xpath("//input [contains(@id, 'name')]")).sendKeys("NemanjaG");
                driver.findElement(By.xpath("//input [contains(@id, 'department')]")).sendKeys("HRbot");
                driver.findElement(By.xpath("//input [contains(@id, 'phone')]")).sendKeys("0356246");
                driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[last()]/td[last()]/a[1][last()]")).click();
                driver.findElement(By.xpath("//button [contains(@class, 'add-new' )]")).click();


            }
            driver.quit();


        }
    }
}
