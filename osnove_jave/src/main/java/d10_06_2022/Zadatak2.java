package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        2.Zadatak
//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!


        driver.manage().window().maximize();
        driver.navigate().to("https://geodata.solutions/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));



        Select dropCountry = new Select
                (driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/select[1]")));

        List<WebElement> countries = dropCountry.getOptions();
        Random randomCountries = new Random();
        int randomCountryIndex = randomCountries.nextInt(countries.size());
        dropCountry.selectByIndex(randomCountryIndex);

        Thread.sleep(5000);

        Select dropState = new Select
                (driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/select[2]")));

        List<WebElement> states = dropState.getOptions();
        Random randomStates = new Random();
        int randomStateIndex = randomStates.nextInt(states.size());
        dropState.selectByIndex(randomStateIndex);

        Thread.sleep(5000);

        Select dropCity = new Select
                (driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/select[3]")));

        List<WebElement> cities = dropCity.getOptions();
        Random randomCities = new Random();
        int randomCityIndex = randomCities.nextInt(cities.size());
        dropCity.selectByIndex(randomCityIndex);
        Thread.sleep(5000);







    }
}
