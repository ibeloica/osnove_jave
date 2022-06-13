package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        5.Zadatak
//        Ucitati stranicu https://demoqa.com/modal-dialogs
//        Kliknuti na dugme Large modal
//        Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke


        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showLargeModal")).click();
        if (elementExist(driver, By.id("example-modal-sizes-title-lg"))) {
            System.out.println("Dijalog postoji");
        } else {
            System.out.println("Dijalog ne postoji");
        }

    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
