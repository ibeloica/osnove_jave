package vezbanjeMetode1605;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        6. Zadatak
//        Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        stampaZvezdice(n);


    }static void stampaZvezdice(int n){
        for (int i = 0; i <n ; i++) {
            System.out.print("*");


        }
        System.out.println();
    }
}
