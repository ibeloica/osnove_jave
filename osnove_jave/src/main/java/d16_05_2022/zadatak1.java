package d16_05_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//            Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        System.out.println("Unesi x: ");
        int x = s.nextInt();
        stampajVrednostZa10Vecu(x);

    }

    static void stampajVrednostZa10Vecu(int x) {
        System.out.println(x + 10);
    }
}