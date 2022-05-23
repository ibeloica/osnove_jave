package p23_05_2022;

public class FacebookPost {

//    Kreirati klasu FacebookPost
//            opis
//    korisnik (referenca na korisnika koji je kreirao post)
//    konstrukore koje mislite da su vam potrebni
//    metoda print, stampa u formatu:
//            (ime) (prezime)
//            (opis post-a)

    private String opis;
    public Korisnik korisnik;

    FacebookPost() {
    }

    FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public void print() {
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }

}
