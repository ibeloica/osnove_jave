package vezbanjeForPetlje2904;

import java.util.Scanner;

public class domzadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
//                Na kraju programa prikazati sumu.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Suma parnih brojeva je 16
//        Objasnjenje: 2 + 6 + 8 = 16

        System.out.println("unesite n: ");
        int n = s.nextInt();
        int suma = 0;


        for (int i = 0; i < n; i++) {System.out.println("unesite broj: ");
            int broj = s.nextInt();
            if (broj%2==0){suma = suma + broj;}

        }
        System.out.println("Suma parnih brojeva je: "+ suma);

    }
}
