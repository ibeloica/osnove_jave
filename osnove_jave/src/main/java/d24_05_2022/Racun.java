package d24_05_2022;

public class Racun {

//    Zadatak
//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//
//    metodu koja menja stanje na racunu za prosledjenu vrednost
//    (stanje na racunu ne moze da bude manje od nule)
//
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    private String brojRacuna;
    private String vlasnikRacuna;
    private int trenutnoStanje;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public Racun() {
    }

    public Racun(String brojRacuna, String vlasnikRacuna, int trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.vlasnikRacuna = vlasnikRacuna;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public void setVlasnikRacuna(String vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void promenaStanja() {
    }
}
