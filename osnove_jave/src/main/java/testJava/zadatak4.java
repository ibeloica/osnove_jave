package testJava;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Zadatak (Metode)
//        Napisati metodu koja vrsi konverziju metara u cm, dm, km.
//        Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju
//        i vraca konvertovanu vrednost.
//
//        Podsetnik za konverziju jedinica:
//        1m = 100 cm
//        1m = 10 dm
//        1m = 0.001 km
//
//        Primer poziva metode
//        Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//        Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//        U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//        Primer izvrsenja programa:
//        3.5m je 350cm
//        3.5m je 35dm
//        3.5m je 0.0035km

        System.out.println("Unesi vrednost u m: ");
        double vrednost = s.nextDouble();
        String jedinica = "";

        double rezultat = konverzija(vrednost, jedinica);
        System.out.println(vrednost + "m" + " je " + konverzija(vrednost, "cm") + "cm");
        System.out.println(vrednost + "m" + " je " + konverzija(vrednost, "dm") + "dm");
        System.out.println(vrednost + "m" + " je " + konverzija(vrednost, "km") + "km");


    }

    static double konverzija(double vrednost, String jedinica) {
        if (jedinica.equals("cm")) return vrednost * 100;
        else if (jedinica.equals("dm")) {
            return vrednost * 10;
        } else return vrednost / 1000;


    }
}

