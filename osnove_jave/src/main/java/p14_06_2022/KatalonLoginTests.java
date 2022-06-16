package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonLoginTests {

//    1.Zadatak
//    Kreirati klasu KatalonLoginTests za testove
//    Base url: https://cms.demo.katalon.com
//    Test #1: Visit login page from Nav bar
//    Koraci:
//    Ucitati home stranicu
//    Kliknuti na My account link
//    Verifikovati da je naslov stranice My account – Katalon Shop
//    Verifikovati da se u url-u stranice javlja /my-account
//    Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//
//    Test #2: Check input types
//    Koraci:
//    Ucitati /my-account stranicu
//    Verifikovati da  polje za unos email-a za atribu type ima vrednost text
//    Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//    Verifikovati da checkbox Remember me za atribut type ima vrednost checkbox
//    Verifikovati da je Remember me checkbox decekiran.
//    Koristan link kako naci informaciu da li je checkbox cekiran ili ne.
//    Za sve validacije ispisati odgovarajuce poruke u slucaju greske


    private WebDriver driver;
    String baseUrl = "https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test(priority = 10)
    public void visitLoginFromNav() {
        driver.findElement(By.xpath("//a [contains(@href, 'my')]")).click();
        Assert.assertEquals(driver.getTitle(),
                "My account – Katalon Shop",
                "[ERROR]: Title is not 'My account – Katalon Shop' ");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "URL does not contain '/my-account' ");
    }

    @Test(priority = 20)
    public void checkInputTypes() {
        driver.get(baseUrl + "/my-account");

        Assert.assertEquals(driver.findElement(By.id("username")).getAttribute(
                        "type"),
                "text",
                "[ERROR]: Username field input type is not text");

        Assert.assertEquals(driver.findElement(By.id("password")).getAttribute(
                        "type"),
                "password",
                "[ERROR]: Password field input type is not password");

        Assert.assertEquals(driver.findElement(By.id("rememberme")).getAttribute(
                        "type"),
                "checkbox",
                "[ERROR]: Checkbox field input type is not checkbox");

        Assert.assertFalse(driver.findElement(By.id("rememberme")).isSelected(),
                "Checkbox field should be unchecked");


    }


    //    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
