package d03_06_2022_zad1;

public class SuperKartica {

//    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime)

    private String brojKartice;
    private String vlasnik;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String vlasnik, double popust) {
        this.brojKartice = brojKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println("(" + brojKartice + ")" + ", " + "(" + vlasnik + ")");
    }
}
