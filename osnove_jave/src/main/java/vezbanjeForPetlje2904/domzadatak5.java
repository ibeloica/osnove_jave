package vezbanjeForPetlje2904;

import java.util.Scanner;

public class domzadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji pronalazi 7 stepen broja 2.
//        Izvrsenje:
//        x na stepen y je 128

        System.out.println("unesite x: ");
        int x = s.nextInt();
        System.out.println("unesite y: ");
        int y = s.nextInt();
        int z = 1;


        for (int i = 1; i <= y; i++) {
            z = z * x;


        }
        System.out.println(x + " na stepen " + y + " je " + z);

    }
}
