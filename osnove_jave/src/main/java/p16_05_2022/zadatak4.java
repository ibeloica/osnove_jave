package p16_05_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        4. Napisati funkciju koja stampa zbir, razliku,
//        proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije.
//        U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.



        operacije(5,4);

    }

    static void operacije(int x , int y) {

        System.out.println("Zbir je " + (x + y));
        System.out.println("Razlika je " + (x - y));
        System.out.println("Proizvod je " + x * y);
        System.out.println("Kolicnik je " + x / y);
    }

}
