package vezbanjeWhilePetlje0905;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

////        Zadatak
////        Napisati program koji od korisnika trazi da unosi brojeve sve dok ne unese nulu.
////        U ovom programu nemamo N kao u proslom zadataku.
////                Primer:
////        Unesite broj: 1
////        Unesite broj: 3
////        Unesite broj: 5
////        Unesite broj: 0
//        Posto je uneta nula, to je kraj.


        System.out.println("unesite broj: ");
        int broj = s.nextInt();
        while (broj != 0) {
            System.out.println("unesite broj: ");
            broj = s.nextInt();
            if (broj == 0) {
                System.out.println("Posto je uneta nula, tu je kraj");


            }
        }
    }
}
