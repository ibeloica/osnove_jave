package d31_05_2022_zad1;

public class MainOsobaIgracTrener {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Pera Peric", "12345",
                1988, 10, "golman", true);
        Igrac i2 = new Igrac("Jova Jovic", "654321",
                1983, 7, "napadac", false);

        Trener t1 = new Trener("Rasa Antic", "987654",
                1960, 30, "glavni");
        Trener t2 = new Trener("Ivica Osim", "698574",
                1955, 35, "personalni");

        i1.stampaj();
        System.out.println();
        i2.stampaj();
        System.out.println();
        t1.stampaj();
        System.out.println();
        t2.stampaj();
    }
}
