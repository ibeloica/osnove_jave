package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {
//        1. Zadatak
//        Napisati program koji prijavljivanju na stranicu
//        http://cms.demo.katalon.com/my-account/, cekira Remember me checkbox.

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        1. Zadatak
//        Napisati program koji prijavljivanju na stranicu http://cms.demo.katalon.com/my-account/,
//        // cekira Remember me checkbox.



        driver.navigate().to("http://cms.demo.katalon.com/my-account/");
        driver.findElement(By.xpath("//input [contains(@name, 'remember')]")).click();






    }
}
