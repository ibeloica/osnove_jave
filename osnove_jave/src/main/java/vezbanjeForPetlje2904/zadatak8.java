package vezbanjeForPetlje2904;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        8. Napisati program koji racuna godisnju platu za ulaznu QA poziciju u firmi.
//        Prva tri meseca je placena praksa u iznosu od 30 hiljada,
//        zatim sledecih 6 meseci prva plata je 50 hiljada i
//        poslednja tri meseca povecanje od 5000 dinara.
//        Na kraju godine postoji bonus u iznosu od 40 hiljada. Ispisati kolika je godisnja plata.

        int godisnja = 0;
        int plata = 0;

        for (int i = 0; i < 3; i++) {
           plata = plata + 30000;

        }
        for (int i = 0; i < 6; i++) {
            plata = plata + 50000;

        }
        for (int i = 0; i < 3; i++) {
            plata = plata + 50000 + 5000;

        }

        godisnja = plata + 40000;
        System.out.println("Godisnja plata je " + godisnja);



    }
}
