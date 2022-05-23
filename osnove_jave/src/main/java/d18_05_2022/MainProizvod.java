package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Galeb";
        cokolada.cena = 95.50;
        cokolada.tezinaUGr = 100.0;

        cokolada.stampaj();

        Proizvod grisini = new Proizvod();
        grisini.naziv = "Trik";
        grisini.cena = 32.20;
        grisini.tezinaUGr = 32.0;

        grisini.stampaj();
    }
}
