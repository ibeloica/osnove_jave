package p30_05_2022_zad1;

import java.util.ArrayList;

public class Pasta {

//    Kreirati klasu Pasta koja ima:
//    niz sastojaka
//    metodu za dodavanje sastojka
//            (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//            defaultni konstruktor
//    metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//    metodu za stampu koja stampa podatke u formatu:
//    Pasta je sa sastojcima:
//    naziv - cena.din
//    naziv - cena.din
//    naziv - cena.din
//    Cena paste je cena.din

    ArrayList<Sastojak> sastojci = new ArrayList<>();

    public void dodajSastojak(Sastojak sastojak) {
        this.sastojci.add(sastojak);
    }

    public Pasta() {
    }

    public void cenaPaste() {
        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getCena();

        }
    }
    public void stampaj(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + " - " + sastojci.get(i).getCena());
            System.out.println("Cena paste je s");

        }

    }
}
