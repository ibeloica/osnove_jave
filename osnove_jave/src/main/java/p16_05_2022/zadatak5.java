package p16_05_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        5. Zadatak
//        Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

        stampajApsolutnuVrednost(-6);


    }

    static void stampajApsolutnuVrednost(int x) {
        if (x < 0) {
            x = -x;
        } else x = x;
        System.out.println("Apsolutna vrednost je: " + x);
    }
}
