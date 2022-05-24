package p24_05_2022;

public class MainUgovorFizickoLice {
    public static void main(String[] args) {

        FizickoLice prodavac = new FizickoLice
                ("Pera Peric", "08974", "987456", false);
        FizickoLice kupac = new FizickoLice
                ("Miki Mikic", "03564", "1234567", true);

        Ugovor noviUgovor = new Ugovor("12122022", prodavac, kupac, 10000, "Dusanova 8, Nis");

        noviUgovor.stampaj();


    }
}
