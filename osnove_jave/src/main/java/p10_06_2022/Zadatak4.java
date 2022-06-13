package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        4.Zadatak
//        Ucitava stranicu https://demoqa.com/login
//        Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//                Zatim ceka 5sekundi da se korisnik uloguje
//        Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout.
//        Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//        Klikce na dugme za logout
//        Gasi stranicu

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demoqa.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input [contains(@id, 'user')]"))
                .sendKeys("itbootcamp");
        driver.findElement(By.xpath("//input [contains(@id, 'pass')]"))
                .sendKeys("ITBootcamp2021!");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button [contains(@id, 'login')]")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//button [contains(@id, 'logout')]"));
        if (elements.size() > 0) {
            System.out.println("Element postoji");
        } else {
            System.out.println("Ne postoji");
        }
        driver.findElement(By.xpath("//button [contains(@id, 'logout')]")).click();
        Thread.sleep(10000);
        driver.quit();

    }
}




//        4.Zadatak
//        Ucitava stranicu https://demoqa.com/login
//        Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//                Zatim ceka 5sekundi da se korisnik uloguje
//        Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout.
//        Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//        Klikce na dugme za logout
//        Gasi stranicu




