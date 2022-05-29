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
    private double trenutnoStanje;

    public Racun() {
    }

    public Racun(String brojRacuna, String vlasnikRacuna, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.vlasnikRacuna = vlasnikRacuna;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
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

    public double getTrenutnoStanje() {
        return this.trenutnoStanje;
    }

    public void promenaStanja(double transakcija) {
        if (this.trenutnoStanje + transakcija > 0) {
            this.trenutnoStanje = this.trenutnoStanje + transakcija;
        } else this.trenutnoStanje = this.trenutnoStanje;
    }


    public void stampaj() {
        System.out.println(this.vlasnikRacuna + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je " + this.trenutnoStanje);
    }

}
