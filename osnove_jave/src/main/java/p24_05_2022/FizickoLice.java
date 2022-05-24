package p24_05_2022;

public class FizickoLice {

//    Zadatak
//    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//    ime i prezime
//    broj licne karte
//            jmbg
//    podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//    konstuktore
//    gettere i settere, jmbg ne sme da se menja
//    metodu stampaj, koja stmpa podatke u formatu:
//    ime i prezime, broj licne karte

    private String imePrezime;
    private String licnaKarta;
    private String jmbg;
    private boolean stariKupac;

    public FizickoLice() {
    }

    public FizickoLice(String imePrezime, String licnaKarta, String jmbg, boolean stariKupac) {
        this.imePrezime = imePrezime;
        this.licnaKarta = licnaKarta;
        this.jmbg = jmbg;
        this.stariKupac = stariKupac;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getLicnaKarta() {
        return licnaKarta;
    }

    public void setLicnaKarta(String licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public String getJmbg() {
        return jmbg;
    }


    public boolean isStariKupac() {
        return stariKupac;
    }

    public void setStariKupac(boolean stariKupac) {
        this.stariKupac = stariKupac;
    }

    public void stampaj() {
        System.out.println(this.imePrezime + " , " + this.licnaKarta);
    }
}
