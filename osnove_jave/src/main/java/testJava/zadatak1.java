package testJava;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Zadatak (Grananja)
//        Napisati program koji simulira notifikaciju za novu verziju aplikacije.
//                Korisnik unosi verziju aplikacije koju ima instaliranu na svom racunaru
//        a zatim najnoviju verziju, nakon cega se ispisuje notifikacija.
//        Verzija aplikacije se sastoji od major i minor broja.
//                Aplikacije imaju verziju uglavnom u formatu major.minor i
//        primer bi bio Facebook 2.1 gde je major=2 i minor=1
//        Aplikacija je novije verzije ukoliko je:
//        major broj veci ili
//        ukoliko je major isti, tada nova verzija ima veci minor
//
//        Napomena: Smatrati da korisnik za najnoviju verziju unosi
//        vecu ili istu verziju od instalirane, nikako manju.

        System.out.println("Unesite major verziju instalirane aplikacije: ");
        int majorInst = s.nextInt();
        System.out.println("Unesite minor verziju instalirane aplikacije: ");
        int minorInst = s.nextInt();
        System.out.println("Na racunaru je instalirana verzija " + majorInst + "." + minorInst);
        System.out.println("Unesite major verziju najnovije aplikacije: ");
        int majorNova = s.nextInt();
        System.out.println("Unesite minor verziju najnovije aplikacije: ");
        int minorNova = s.nextInt();
        System.out.println("Najnovija verzija je " + majorNova + "." + minorNova);

        int instVerzija = majorInst + minorInst / 10;
        int novaVerzija = majorNova + minorNova / 10;

        if (instVerzija < novaVerzija) {
            System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
        } else System.out.println("Vec imate najnoviju verziju na svom racunaru");

    }
}
