package d02_06_2022_zad1;

import java.util.ArrayList;

public class MainMagacionerMenadzer {
    public static void main(String[] args) {

        Sektor s1 = new Sektor("prodaja", 40000.0);
        Sektor s2 = new Sektor("nabavka", 50000.0);
        Sektor s3 = new Sektor("knjigovodstvo", 30000.0);
        Sektor s4 = new Sektor("magacin", 35000.0);
        Sektor s5 = new Sektor("uprava", 100000.0);
        Sektor s6 = new Sektor("logistika", 60000.0);







        Magacioner m1 = new Magacioner("Pera Peric");
        Menadzer m2 = new Menadzer("Zika Zikic");

        m1.zaposliUSektor(s4);
        m1.zaposliUSektor(s2);
        m2.zaposliUSektor(s5);
        m2.zaposliUSektor(s1);

        System.out.println("Plata magacionera je: " + m1.plataRadnika());
        System.out.println("Plata menadzera je: " + m2.plataRadnika());





    }
}
