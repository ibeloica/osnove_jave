package p24_05_2022;

public class Ugovor {

//    Kreirati klasu Ugovor koja ima:
//    godinu, dan i mesec sklapanja ugovora
//    osobu koja prodaje nekretninu (fizicko lice)
//    osobu koja kupuje nekretninu (fizicko lice)
//    cenu za koju se prodaje nekretnina
//    adresu nekretnine (ulica br., grad)
//
//    metodu koja vraca procenat zarade
//    za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//
//    metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze,
//    takse i usluge agencije, prema formuli:
//            1000 + cena za koju se prodaje * procenat zarade
//
//    metodu koja stampa ugovor u formatu:
//    Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca)
//    i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin)
//    pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

    private String datumUgovora;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresa;

    public Ugovor(String datumUgovora, FizickoLice prodavac, FizickoLice kupac,
                  double cenaNekretnine, String adresa) {
        this.datumUgovora = datumUgovora;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cenaNekretnine = cenaNekretnine;
        this.adresa = adresa;


    }

    public String getDatumUgovora() {
        return datumUgovora;
    }

    public void setDatumUgovora(String datumUgovora) {
        this.datumUgovora = datumUgovora;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public double getCenaNekretnine() {
        return cenaNekretnine;
    }

    public void setCenaNekretnine(double cenaNekretnine) {
        this.cenaNekretnine = cenaNekretnine;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double procenat() {
        if (this.prodavac.isStariKupac() == true) {
            return 0.02;
        } else return 0.03;
    }

    public double zaradaAgencije() {
        if (this.prodavac.isStariKupac() == true) {
            return 1000 + this.cenaNekretnine * 0.02;
        } else return 1000 + this.cenaNekretnine * 0.03;


    }

    public void stampaj() {
        System.out.println("Dana " + this.datumUgovora + "god sklopljen je ugovor izmedju ");
        this.prodavac.stampaj();
        System.out.print(" i ");
        this.kupac.stampaj();
        System.out.print(" o kupovini nekretnine ");
        System.out.print(this.adresa + " po ceni od "
                + this.cenaNekretnine + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
                + this.zaradaAgencije());
    }

}
