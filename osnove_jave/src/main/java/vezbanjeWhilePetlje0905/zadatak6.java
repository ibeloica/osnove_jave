package vezbanjeWhilePetlje0905;

import javax.swing.*;
import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        .Zadatak
//        Napisati program koji od korisnika ucitava stanje na racunu
//        a zatim sa racuna skida dok god ima sredstava za transakciju.
//                U slucaju da nema dovoljno sredstava ispisati odgovarajucu gresku.
//                Primer izvrsenja:
//        Unesite stanje na racunu: 100
//        Na racunu imate $100, Unesite sumu za sledecu transakciju: 50
//        Na racunu imate $50, Unesite sumu za sledecu transakciju: 31
//        Na racunu imate $19, Unesite sumu za sledecu transakciju: 20
//        Nemate dovoljno sredstava na racunu.Na racunu vam je ostalo $19

        System.out.println("Unesite stanje na racunu:");
        int stanje = s.nextInt();
        System.out.println("Stanje na racunu je " + stanje);
        System.out.println("Unesite iznos transakcije: ");
        int transakcija = s.nextInt();

        while (stanje >= transakcija) {
            stanje = stanje - transakcija;
            System.out.println("Stanje na racunu je " + stanje);
            System.out.println("Unesite iznos transakcije: ");
            transakcija = s.nextInt();
        }

        System.out.println("Nemate dovoljno sredstava.Stanje je " + stanje);


    }
}

