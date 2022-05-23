package p23_05_2022;

public class MainKupacProizvodClanskaKarta {
    public static void main(String[] args) {


        ClanskaKarta clanskaKarta = new ClanskaKarta();
        clanskaKarta.getPopust();
        Kupac kupac = new Kupac();
        kupac.getClanskaKarta();
        Proizvod proizvod = new Proizvod();
        proizvod.getKupac();


    }
}
