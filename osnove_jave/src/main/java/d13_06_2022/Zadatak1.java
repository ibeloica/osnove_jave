package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

//        Zadatak
//        Napisati program koji ima:
//        Podesava:
//        implicitno cekanje za trazenje elemenata od 10s
//        implicitno cekanje za ucitavanje stranice od 10s
//        eksplicitno cekanje podeseno na 10s
//        Podaci:
//        Potrebno je u projektu ukljuciti 4 slike.
//                Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
//        Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
//        Koraci:
//        Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
//        Maksimizuje prozor
//        Selektuje Image - Front klikom na tu karticu u dnu ekrana
//        Klik na add photo iz levog navigacionog menia
//        Upload slike. Upload preko File objekta koristeci getAbsolutePath
//        Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
//        Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
//        Ceka da dijalog bude vidljiv
//        Klik na Use One Side Only dugme
//        Ponoviti proces za Left, Right i Back
//        Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
//        Kliknuti na Add To Cart dugme
//        Verifikovati postojanje greske Oops!
//        It looks like you`ve not added an text to this field, please add one before continuing.
//        Xpath: //*[@action='error']
//        Zatvorite pretrazivac

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[contains(@class, 'fendym')]")).click();

        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File slikaFront = new File("src/main/resources/front_ivan_beloica.jpg");


        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]"))
                .sendKeys(slikaFront.getAbsolutePath());




        wait.until(ExpectedConditions.numberOfElementsToBe(
                By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]"), 1));

        driver.findElement(By.xpath("//img[contains(@loading, 'lazy')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[contains(@class, 'sc-iXxrte dxCajp')]")));
        driver.findElement(By.xpath("//button[contains(text(), 'Use One Side Only')]"))
                .click();
//block
        driver.findElement(By.xpath("//img[contains(@alt, 'image 2')]")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File slikaLeft = new File("src/main/resources/left_ivan_beloica.jpg");
        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]"))
                .sendKeys(slikaLeft.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 1));

        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath(
                "//button[contains(text(), 'Use One Side Only')]")).click();
        //block
        driver.findElement(By.xpath(
                "//img[contains(@alt, 'image 3')]")).click();
        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File slikaBack = new File("src/main/resources/back_ivan_beloica.jpg");
        driver.findElement(By.xpath(
                "//input[contains(@id, 'imageUpload')]")).sendKeys(slikaBack.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                "//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 2));

        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath(
                "//button[contains(text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath(
                "//img[contains(@alt, 'image 4')]")).click();
        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File slikaRight = new File("src/main/resources/right_ivan_beloica.jpg");
        driver.findElement(By.xpath(
                "//input[contains(@id, 'imageUpload')]")).sendKeys(slikaRight.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                "//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 3));

        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath(
                "//button[contains(text(), 'Use One Side Only')]")).click();


        driver.findElement(By.xpath(
                "//div[contains(@class, 'sc-jhzXDd emMrhw')]")).click();
        driver.findElement(By.xpath(
                "//button[contains(@type, 'submit')]")).click();

        WebElement greska = driver.findElement(By.xpath("//*[@action='error']"));

        System.out.println("Vrednost pop up atributa je: " + greska.getAttribute("action"));

        Thread.sleep(10000);


        Thread.sleep(5000);
        driver.quit();


    }
}