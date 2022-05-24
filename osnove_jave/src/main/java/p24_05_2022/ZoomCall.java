package p24_05_2022;

public class ZoomCall {

//    Kreirati klasu ZoomCall koja ima:
//    link za poziv
//            password
//    korisnika koji je host
//    korisnika koji je guest
//    gettere za sve atribute
//    setter samo za guest-a
//    metodu pokreni poziv koja stampa podatke u formatu:
//    Zoom Call: url
//    Password: password
//    Host: ime i prezime
//    Guest: ime i prezime
//    Maksimalno trajanje poziva je (broj minuta)min
//
//    Maksimalno trajanje poziva se cita od korisnika koji je host!


    public ZoomCall(String linkPoziva, String password, Korisnik korisnikHost, Korisnik korisnikGuest) {
        this.linkPoziva = linkPoziva;
        this.password = password;
        this.korisnikHost = korisnikHost;
        this.korisnikGuest = korisnikGuest;
    }

    private String linkPoziva;

    private String password;
    private Korisnik korisnikHost;
    private Korisnik korisnikGuest;

    public String getLinkPoziva() {
        return linkPoziva;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getKorisnikHost() {
        return korisnikHost;
    }

    public Korisnik getKorisnikGuest() {
        return korisnikGuest;
    }

    public void setKorisnikGuest(Korisnik korisnikGuest) {
        this.korisnikGuest = korisnikGuest;
    }

    public void pokreniPoziv() {
        System.out.println("Zoom Call: " + getLinkPoziva());
        System.out.println("Password: " + getPassword());
        System.out.println("Host: " + getKorisnikHost().getImePrezime());
        System.out.println("Guest: " + getKorisnikGuest().getImePrezime());
        System.out.println("Maksimalno trajanje poziva je " + getKorisnikHost().maxDuzinaPoziva() + "minuta");
    }
}
