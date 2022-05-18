package vezbanjeNizovi1005;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {

//        2.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.

        ArrayList<Integer>niz = new ArrayList<Integer>();
        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);

        niz.set(2, niz.get(2)*10);
        System.out.println(niz);




    }
}
