package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        File slika = new File("src/main/resources/IMG_2994.jpg");

        driver.navigate().to("https://www.file.io/");

        driver.findElement(By.id("upload-button")).sendKeys(slika.getAbsolutePath());

        Thread.sleep(10000);




    }
}
