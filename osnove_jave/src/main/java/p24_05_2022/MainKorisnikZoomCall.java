package p24_05_2022;

public class MainKorisnikZoomCall {
    public static void main(String[] args) {

//        U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija

        Korisnik korisnik1 = new Korisnik();
        korisnik1.setImePrezime("Dilan Dog");
        korisnik1.pretplatiSe(150);
        korisnik1.getLicenca();
        korisnik1.maxDuzinaPoziva();


        Korisnik korisnikGuest = new Korisnik();
        korisnikGuest.setImePrezime("Mister No");
        korisnikGuest.pretplatiSe(100);
        korisnikGuest.getLicenca();
        korisnikGuest.maxDuzinaPoziva();


        ZoomCall poziv1 = new ZoomCall("www.poziv.com", "1234", korisnik1, korisnikGuest);
        poziv1.pokreniPoziv();

    }
}
