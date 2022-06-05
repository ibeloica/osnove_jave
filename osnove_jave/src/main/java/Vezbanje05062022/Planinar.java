package Vezbanje05062022;

public abstract class Planinar {

//    (15 poena) Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
//            ●	jedinstveni celobrojni identifikacioni broj
//●	ime i prezime
//    Dok od javnih metoda:
//            ●	konstruktor koji postavlja sve atribute klase.
//            ●	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije
//            tj. posle njihovog postavljanja u konstruktoru)
//●	apstraktnu metodu štampaj
//●	apstraktnu metodu koja vraca clanarinu planinara
//●	apstraktnu metodu uspesanUspon koja vraća informaciju
// da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina

    protected int idPlaninara;
    protected String imePlaninara;

    public Planinar(int idPlaninara, String imePlaninara) {
        this.idPlaninara = idPlaninara;
        this.imePlaninara = imePlaninara;
    }

    public int getIdPlaninara() {
        return idPlaninara;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }
    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

}
