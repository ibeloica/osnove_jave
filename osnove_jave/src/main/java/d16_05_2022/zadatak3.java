package d16_05_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        System.out.println("Unesi JMBG: ");
        String jmbg = s.next();
        System.out.println("Unesi ime: ");
        String ime = s.next();
        System.out.println("Unesi prezime: ");
        String prezime = s.next();
        System.out.println("Unesi god: ");
        String god = s.next();
        System.out.println("Da li je korisnik aktivan(da/ne): ");
        boolean aktivan = s.nextBoolean();

        podaciKorisnika(jmbg, ime, prezime, god, aktivan);



    }static void podaciKorisnika (String jmbg, String ime, String prezime, String god, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);}
    }
