package p03_06_2022_zad1;

import p30_05_2022_zad1.Sastojak;

import java.util.ArrayList;

public abstract class Proizvod {

//    Kreirati abstraktnu klasu Proizvod koja ima:
//    niz dodataka
//    metodu ubaciDodatak koja dodaje dodatak u niz
//    metodu koja vraca cenu svih dodataka koje ima proizvod
//    abstraktnu metodu ukupnu racunaj cenu
//    abstraktnu metodu stampaj

    protected ArrayList<Dodatak> dodaci = new ArrayList<>();

    public void ubaciDodatak(Sastojak sastojak) {
        dodaci.add(new Dodatak());
    }

    public int cenaDodataka() {
        int suma = 0;
        for (int i = 0; i < dodaci.size(); i++) {
            dodaci.get(i).getCena();


        }return suma;
    }
    public abstract int racunajUkupnuCenu();

    public abstract void stampaj();

}
