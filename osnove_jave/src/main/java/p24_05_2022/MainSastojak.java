package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSastojak {
    public static void main(String[] args) {


        ArrayList<Sastojak> Sastojci = new ArrayList<>();
        Sastojak s1 = new Sastojak("so", 100);
        Sastojak s2 = new Sastojak("biber", 200);
        Sastojak s3 = new Sastojak("vegeta", 300);

        Sastojci.add(s1);
        Sastojci.add(s2);
        Sastojci.add(s3);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj sastojaka: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("unesite sastojak: ");
            String sastojak = s.next();
            System.out.println("unesite cenu: ");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(sastojak, cena);
            Sastojci.add(x);
        }
        for (int i = 0; i < Sastojci.size(); i++) {
            System.out.print(Sastojci.get(i).getNaziv());
            System.out.println(Sastojci.get(i).getCena());

        }
        int suma = 0;
        for (int i = 0; i < Sastojci.size(); i++) {
            suma = suma + Sastojci.get(i).getCena();

        }


    }

}

