package Vezbanje05062022;

import p03_06_2022_zad2.PoreskaUprava;

import java.util.ArrayList;

public class PlaninarskiDom {

//    (25 poena) Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//            ●	naziv doma
//●	godinu kada je osnovan.
//            ●	članove doma koji su planinari (klasa vodi računa o nizu)
//    Dok od javnih:
//            ●	default-ni konstuktor i konstuktor koji postavlja sve parametre
//●	gettere i settere koji su potrebni
//●	metodu učlani planinara, koja dodaje planinara u niz
//●	metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//●	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//●	metodu koja štampa podatke o domu i o svim članovima doma
//●	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari = new ArrayList<>();

    public PlaninarskiDom() {
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public void uclaniPlaninara(Planinar planinar) {
        this.planinari.add(planinar);
    }

    public int uspesniUsponi(Planina planina) {
        int brojac = 0;
        for (int i = 0; i < this.planinari.size() ; i++) {
            if (this.planinari.get(i).uspesanUspon(planina)) {
                brojac++;
            }
        }
        return brojac;
    }
    public void izbaciPlaninara(int idBroj) {
        for (int i = 0; i < this.planinari.size() ; i++) {
            if (this.planinari.get(i).getIdPlaninara() == idBroj) {
                this.planinari.remove(i);
            }
        }
    }
    public void stampaj() {
        System.out.println("Naziv doma: " + this.nazivDoma);
        System.out.println("Godina osnivanja: " + this.godinaOsnivanja);
        System.out.println();
        for (int i = 0; i < this.planinari.size() ; i++) {
            this.planinari.get(i).stampaj();
        }

    }
    public int mesecniPrihod() {
        int mesecniPrihodi = 0;
        for (int i = 0; i < this.planinari.size() ; i++) {
            mesecniPrihodi += this.planinari.get(i).clanarina();
        }
        return mesecniPrihodi;
    }
}
