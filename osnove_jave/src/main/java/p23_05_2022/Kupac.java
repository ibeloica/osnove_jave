package p23_05_2022;

public class Kupac {

//    Kreirati klasu Kupac koja ima:
//    ime i prezime
//    clansku kartu
//    gettere i settere, clanska karta ne moze da se menja
//            konstruktore
//    metodu stampaj koja stampa u formatu
//    ime i prezime - broj kartice

    private String imePrezime;
    private ClanskaKarta clanskaKarta;

    public Kupac(){}

    public Kupac(String imePrezime, ClanskaKarta clanskaKarta) {
        this.imePrezime = imePrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
    public void stampaj(){
        System.out.println(imePrezime + " - " + clanskaKarta.getBrojKartice());
    }


}
