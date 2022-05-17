package d16_05_2022;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//        vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        System.out.println("unesite x: ");
        int x = s.nextInt();
        System.out.println("unesite y: ");
        int y = s.nextInt();
        System.out.println("Nova vrednost je: " + novaVrednost(x, y));


    }

    static int novaVrednost(int x, int y) {

        int z = x * 10 + y;
        return z;
    }
}
