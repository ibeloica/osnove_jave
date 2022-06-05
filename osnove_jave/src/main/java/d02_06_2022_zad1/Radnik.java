package d02_06_2022_zad1;

import java.util.ArrayList;

public abstract  class Radnik {

//    Kreirati abstraktnu klasu Radnik koja ima:
//    ime i prezime
//    niz sektora u kojima radi
//    abstraktnu metodu koja vraca platu radnika
//    metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    protected String imeRadnika;
    public ArrayList<Sektor>sektori = new ArrayList<>();




    public abstract double plataRadnika();

    public void zaposliUSektor(Sektor sektor){sektori.add(sektor);}

    public Radnik(){}

    public Radnik(String imeRadnika) {
        this.imeRadnika = imeRadnika;

    }

    public String getImeRadnika() {
        return imeRadnika;
    }

    public void setImeRadnika(String imeRadnika) {
        this.imeRadnika = imeRadnika;
    }

    public ArrayList<Sektor> getSektori() {
        return sektori;
    }

    public void setSektori(ArrayList<Sektor> sektori) {
        this.sektori = sektori;
    }



}
