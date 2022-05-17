package d16_05_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
///       / / / /

        System.out.println("unesite n: ");
        int n = s.nextInt();
        System.out.println("unesite karakter: ");
        String karakter = s.next();

        stampaKarakter(n, karakter);



    }static void stampaKarakter(int n, String karakter) {
        for (int i = 0; i <n ; i++) {
            System.out.print(karakter);

        }
    }
}
