package d24_05_2022;

public class Transakcija {

//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar
//    koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju
//    u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//    Kao parametar funkcije se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//    a na drugi racun dodaje samo (trazena suma).
//            (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna
//
//    Naravno u glavnom kreirati objekte i testirati funkcionalnosti

    private int idTransakcije;
    private String racunPosiljaoca;
    private String racunPrimaoca;

    public Transakcija() {
    }

    public Transakcija(int idTransakcije, String racunPosiljaoca, String racunPrimaoca) {
        this.idTransakcije = idTransakcije;
        this.racunPosiljaoca = racunPosiljaoca;
        this.racunPrimaoca = racunPrimaoca;
    }

    Racun racun = new Racun();

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public String getRacunPosiljaoca() {
        return racunPosiljaoca;
    }

    public void setRacunPosiljaoca(String racunPosiljaoca) {
        this.racunPosiljaoca = racunPosiljaoca;
    }

    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(String racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }


}
