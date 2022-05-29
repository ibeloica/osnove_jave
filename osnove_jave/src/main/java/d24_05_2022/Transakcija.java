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
    private Racun racunPosiljaoca;
    private Racun racunPrimaoca;


    public Transakcija() {
    }

    public Transakcija(int idTransakcije) {
        this.idTransakcije = idTransakcije;

    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunPosiljaoca() {
        return racunPosiljaoca;
    }

    public void setRacunPosiljaoca(Racun racunPosiljaoca) {
        this.racunPosiljaoca = racunPosiljaoca;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    private double provizija(double transakcija) {
        if (transakcija < 4500) {
            return 45;
        }
        return transakcija / 100;
    }

    public void izvrsiTransakciju(double transakcija) {
        if (this.racunPrimaoca.getTrenutnoStanje() > (transakcija + provizija(transakcija))) {
            this.racunPosiljaoca.promenaStanja(-transakcija - this.provizija(transakcija));
            this.racunPrimaoca.promenaStanja(transakcija);
        }
    }


    public void stampaj() {
        System.out.println("ID transakcije je: " + this.idTransakcije);
        System.out.println("Racun sa: " + racunPosiljaoca.getVlasnikRacuna() + " - "
                + racunPosiljaoca.getBrojRacuna());
        System.out.println("Racun na: " + racunPrimaoca.getVlasnikRacuna() + " - "
                + racunPrimaoca.getBrojRacuna());
    }
}



