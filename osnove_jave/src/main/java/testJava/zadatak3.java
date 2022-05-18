package testJava;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Zadatak (While petlja)
//        Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//        Lozinka je validna ukoliko ima minimum 8 karaktera i
//        sadrzi bar jedan od dva specijalna karaktera
//        a specijalni karakteri su @ i #
//
//        Primer izvrsenja:
//        Unesite lozinku: ITBootcamp
//        Lozinka nije validna.
//                Unesite lozinku: ITBootcamp12
//        Lozinka nije validna.
//                Unesite lozinku: ITBoo@
//        Lozinka nije validna.
//                Unesite lozinku: ITBootcamp@
//        Lozinka je validna.

        System.out.println("Unesite lozinku: ");
        String lozinka = s.next();
        while (!lozinka.contains("@") || !lozinka.contains("#") || lozinka.length() < 8) {
            System.out.println("Lozinka nije validna");
            System.out.println("Unesite lozinku: ");
            lozinka = s.next();


        }
        System.out.println("Lozinka je validna.");
    }
}