package p18_05_2022;

import java.util.Scanner;

public class MainRacun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun milan = new Racun();
        milan.brojRacuna = "160-248-160";
        milan.imePrezime = "Milan Inter";
        milan.stanjeRacuna = 120000.25;
        System.out.println("Broj racuna je " + milan.brojRacuna);
        System.out.println("Ime i prezime je " + milan.imePrezime);
        System.out.println("Stanje racuna je " + milan.stanjeRacuna);

        Racun pipo = new Racun();
        pipo.brojRacuna = "160-233-160";
        pipo.imePrezime = "Filipo Inzagi";
        pipo.stanjeRacuna = 154546.57;
        System.out.println("Broj racuna je " + pipo.brojRacuna);
        System.out.println("Ime i prezime je " + pipo.imePrezime);
        System.out.println("Stanje racuna je " + pipo.stanjeRacuna);

        System.out.println("Posiljalac " + milan.imePrezime + ", " + milan.brojRacuna + ", " + "stanje " + milan.stanjeRacuna);
        System.out.println("Primalac " + pipo.imePrezime + ", " + pipo.brojRacuna + ", " + "stanje " + pipo.stanjeRacuna);
        System.out.println("Unesite transakciju: ");
        double transakcija = s.nextDouble();
        milan.stanjeRacuna = milan.stanjeRacuna - transakcija;
        pipo.stanjeRacuna = pipo.stanjeRacuna + transakcija;

        System.out.println("Posiljalac " + milan.imePrezime + ", " + milan.brojRacuna + ", " + "stanje " + milan.stanjeRacuna);
        System.out.println("Primalac " + pipo.imePrezime + ", " + pipo.brojRacuna + ", " + "stanje " + pipo.stanjeRacuna);



    }
}
