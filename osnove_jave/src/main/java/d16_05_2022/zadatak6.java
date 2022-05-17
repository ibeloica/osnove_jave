package d16_05_2022;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.


        System.out.println("unesite x: ");
        int x = s.nextInt();
        System.out.println("unesite y: ");
        int y = s.nextInt();
        System.out.println("unesite z: ");
        int z = s.nextInt();

        if (najmanjiBroj(x, y, z) != 0) {
            System.out.println("Najmanji broj je: " + najmanjiBroj(x, y, z));
        } else System.out.println("nema najmanjeg broja");


    }

    static int najmanjiBroj(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else if (z < x && z < y) {
            return z;
        } else return 0;
    }
}