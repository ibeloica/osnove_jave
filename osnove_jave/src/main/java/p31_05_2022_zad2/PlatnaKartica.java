package p31_05_2022_zad2;

public class PlatnaKartica {

//    2.Zadatak
//    Napraviti klasu PlatnaKartica koja ima
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica
//    konstruktor sa parametrima
//    gettere za sve atribute, bez settera
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
//    metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//    metodu koja stampa podatke o kartici u formatu:
//            4012-1239-1221-3381, 11/2019, $212

    protected double suma;
    protected String brojKartice;
    protected int godinaVaznosti;
    protected int mesecVaznosti;

    public PlatnaKartica(int suma, String brojKartice, int godinaVaznosti, int mesecVaznosti) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVaznosti = godinaVaznosti;
        this.mesecVaznosti = mesecVaznosti;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVaznosti() {
        return godinaVaznosti;
    }

    public int getMesecVaznosti() {
        return mesecVaznosti;
    }

    public void dodajSredstva(int uplata) {
        this.suma = this.suma + uplata;
    }

    public void izvrsiTransakciju(int isplata) {
        this.suma = this.suma - isplata;
        if (this.suma<0){this.suma = 0;}
    }
    public void stampaj(){
        System.out.println(this.brojKartice + ", " + mesecVaznosti + "/" + godinaVaznosti + " $" + this.suma);
    }
}
