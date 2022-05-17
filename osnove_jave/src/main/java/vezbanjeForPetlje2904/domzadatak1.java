package vezbanjeForPetlje2904;

import java.util.Scanner;

public class domzadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
//        ispisuje tablicu mnozenja za taj broj.
//        Primer:
//        Unesite x: 5
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        5 x 5 = 25
//        5 x 6 = 30
//        5 x 7 = 35
//        5 x 8 = 40
//        5 x 9 = 45

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(broj + " x " + i + " = " + broj*i);

        }



    }
}
