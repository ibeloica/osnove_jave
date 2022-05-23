package p23_05_2022;

import d20_05_2022.MainFacebookPost;

public class MainKorisnikFacebookPost {
    public static void main(String[] args) {

        Korisnik korisnik1 = new Korisnik();
        korisnik1.setIme("Zivota");
        korisnik1.setPrezime("Radmilovic");
        FacebookPost post1 = new FacebookPost();
        post1.setOpis("nicim izazvan izliv emocija");
        post1.setKorisnik(korisnik1);
        post1.print();
    }
}
