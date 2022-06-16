package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        1.Zad
//        Napisati program koji:
//        Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
//        Implicitno cekanje za trazenje elemenata je maksimalno 10s
//        Implicitno cekanje za ucitavanje stranice je 5s
//        Ucitava stranicu https://docs.katalon.com/
//        Maksimizuje prozor
//        Od html elementa cita data-theme atribut.
//                Korisni linkovi za citanje vrednosti atributa link1 i link2
//        Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
//        Klikce na dugme za zamenu tema
//        Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
//        Izvrsava kombinaciju tastera CTRL + K.
//                Koristan link  za keyboard actions…kako izvrsavati precice preko Actions objekta
//        Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
//        Zatvara pretrazivac

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://docs.katalon.com/");
        driver.manage().window().maximize();

        WebElement t = driver.findElement(By.xpath("/html"));
        System.out.println("Data theme attribute is " + t.getAttribute("data-theme"));
        driver.findElement(By.xpath("//button [contains(@title, 'Switch')]")).click();
        System.out.println("Data theme attribute is " + t.getAttribute("data-theme"));
        if (t.getAttribute("data-theme").equals("dark")) {
            new Actions(driver)
                    .keyDown(Keys.CONTROL)
                    .sendKeys("k")
                    .perform();


        } else driver.findElement(By.xpath("//button [contains(@title, 'Switch')]")).click();

        WebElement z = driver.findElement
                (By.xpath("/html/body/div[1]/div/div/header/form/input"));

        System.out.println("Vrednost atributa inputa za pretragu je " + z.getAttribute("type"));
        if (z.getAttribute("type").equals("search")) {
            System.out.println("Pacijent preziveo");
        } else System.out.println("Pacijent krepao");
        driver.quit();
    }
}
