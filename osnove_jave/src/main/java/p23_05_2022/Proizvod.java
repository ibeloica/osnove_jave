package p23_05_2022;

public class Proizvod {

//    Kreirati klasu Proizvod koja ima
//    Naziv proizvoda
//    kupca/musteriju
//    cenu izrade proizvoda
//    gettere i settere
//            konstruktore
//    Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//    cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//    Metodu za stampanje proizvoda u formatu:
//    naziv proizvoda - cena
//    ime i prezime - broj kartice

    private String nazivProizvoda;
    private Kupac kupac;
    private double cenaIzrade;

    public Proizvod() {
    }

    public Proizvod(String nazivProizvoda, Kupac kupac, double cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }


    public double cenaProizvoda() {
        return this.cenaIzrade * 1.9 * (100 - kupac.getClanskaKarta().getPopust()) / 100;

    }
}
