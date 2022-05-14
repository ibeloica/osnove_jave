package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);


//        Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//            Niz je fiksnih vrednosti (ne unosi ih korisnik)
//        zatim korisnik unosi poziciju za koju se racuna suma.
//            Suma za poziciju se racuna tako sto se na vrednost tog polja
//        dodaju vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa
//            (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!
//
//             U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java
//        i postavite tekst zadataka u komentaru a zatim commit-ujte promenu
//        i push-ujte na github sa porukom “Domaci 13.05.2022 Zadatak 1”
//
//        Primer izvrsenja:
//                2,4,6,7,4,
//                4,2,5,1,4,
//                1,4,9,4,5,
//                4,8,5,4,7,
//                4,4,7,4,1,
//                Unesite poziciju: 12
//        Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)

        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);

        int suma = 0;
        int zbirgore = 0;
        int zbirlevo = 0;
        int zbirdesno = 0;
        int zbirdole = 0;


        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();


            }


        }
        System.out.println("unesite poziciju k: ");
        int k = s.nextInt();


        int vrednost = niz.get(k);

        if (k - 5 >= 0) {
            zbirgore = niz.get(k - 5);
        } else zbirgore = 0;

        if ((k - 1) < 0 || (k - 1) % 5 == 4) {
            zbirlevo = 0;
        } else zbirlevo = niz.get(k - 1);

        if ((k + 1) % 5 == 0) {
            zbirdesno = 0;
        } else zbirdesno = niz.get(k + 1);

        if (k + 5 < 25) {
            zbirdole = niz.get(k + 5);
        } else zbirdole = 0;


        suma = vrednost + zbirgore + zbirlevo + zbirdesno + zbirdole;
        System.out.println("Suma je " + suma);


    }
}