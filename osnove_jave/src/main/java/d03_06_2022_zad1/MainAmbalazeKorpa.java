package d03_06_2022_zad1;

public class MainAmbalazeKorpa {
    public static void main(String[] args) {

        Korpa k1 = new Korpa();
        Tetrapak t1 = new Tetrapak("1234", "tetraboca",
                50.50, 75.5, true, 1000.5);
        Tetrapak t2 = new Tetrapak("4321", "tetrategla",
                80.5, 100.5, false, 800.4);
        StaklenaAmbalaza s1 = new StaklenaAmbalaza("5678", "flasa",
                50.5, 80.5, 10.0, true, 300.5);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("9876", "tegla",
                30.2, 45.0, 4.2, false, 200.4);

        k1.dodajAmbalazu(t1);
        k1.dodajAmbalazu(t2);
        k1.dodajAmbalazu(s1);
        k1.dodajAmbalazu(s2);


        System.out.println("Cena korpe je: " +
                k1.cenaKorpe(new SuperKartica("1234", "Pera Peric", 500.0)));

        k1.izbaciAmbalazu("1234");

        System.out.println("Cena korpe je: " +
                k1.cenaKorpe(new SuperKartica("1234", "Pera Peric", 500.0)));

    }
}
