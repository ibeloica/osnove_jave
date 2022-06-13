package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Zadatak
//        Maksimizirati prozor
//        Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//        Dohvatite dugmice za rejting kao listu.
//        XPath za trazenje treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//        Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//        I izvrsite akciju klik na odgovarajuci element preko indeksa
//        Na kraju programa ugasite pretrazivac.

        driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
        driver.manage().window().maximize();

        List<WebElement> x = driver.findElements(By.xpath("//button [contains(@id, 'rating')]"));
        System.out.println("Klikni na zvezdicu: ");
        Scanner s = new Scanner(System.in);
        int zvezdica = s.nextInt();

        for (int i = 0; i < x.size(); i++) {
            x.get(zvezdica - 1).click();

        }
        Thread.sleep(6000);
        driver.quit();


    }
}
