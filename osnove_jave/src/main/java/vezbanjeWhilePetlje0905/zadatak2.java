package vezbanjeWhilePetlje0905;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava N brojeva i te brojeve samo odsampa nakon unosa.
//                Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unet broj je 1.
//        Unesite broj: 4
//        Unet broj je 4.
//        Unesite broj: 9
//        Unet broj je 9.

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            System.out.println("Unet broj je " + broj);
            i++;

        }
    }
}
