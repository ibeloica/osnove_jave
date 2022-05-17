package vezbanjeForPetlje2904;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10)
//        i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//                < | | | | | | | |
//
//        (DOPUNA ZA VEZBANJE)
//        Ukoliko je jacina 0, stampa se </ (simulacija za mute) u suprotonom < | | |  (sa crticama)
//
//        (DOPUNA ZA VEZBANJE 2)
//        Unosi se jacina od 0 do 100, ali da bi se iscrtala jedna crtica potrebno je deset jedinica.
//        Npr: Ako se unese 45, stampaju se 4 crtice
//        npr: ako se unses 39, stampaju se 3 crtice

        System.out.println("uneti jacinu zvuka: ");
        int jacina = s.nextInt();
        System.out.print("<");

        if (jacina == 0) {
            System.out.println("/");
        }

        if (jacina != 0) {
            for (int i = 0; i < jacina/10; i++) {
                System.out.print("|");
            }




        }
    }
}
