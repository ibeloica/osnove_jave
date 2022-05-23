package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod krem = new Proizvod();
        krem.naziv = "Nutela";
        krem.cena = 90.50;
        krem.tezinaUGr = 100.0;

        Proizvod flips = new Proizvod();
        flips.naziv = "Smoki";
        flips.cena = 35.0;
        flips.tezinaUGr = 80.0;



        krem.stampaj();
        krem.povecajCenu(50);
        System.out.println("Cena posle povecanja je: ");
        krem.stampaj();
        System.out.println("Cena sa popustom je: " + krem.vratiCenuSaPopustom(40.0));
        System.out.println(krem.racunajPostarinu());
        krem.stampaj();

        System.out.println();
        flips.stampaj();
        flips.povecajCenu(100);
        System.out.println("Cena posle povecanja je: ");
        flips.stampaj();
        System.out.println("Cena sa popustom je: " + flips.vratiCenuSaPopustom(30.0));
        System.out.println(flips.racunajPostarinu());
        flips.stampaj();


    }
}
