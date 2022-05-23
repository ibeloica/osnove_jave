package d20_05_2022;

public class FacebookPost {

//    1.Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post
//    (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
//    Konstruktore:
//    difoltni konstuktor
//    konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je
//    profilu objavnljen i tekst objave
//    Od metoda:
//    like(), koja povecava broj lajkova za 1.
//    dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//    Primer stampanja:
//    Milan Jovanovic >>> Pera Peric
//    Ovo je tekst objave
//    Likes 3 | Shares 1

    public String posiljaoc;
    public String primaoc;
    public String tekst;
    public int brojLajkova;
    public int brojDeljenja;

    public void like() {
        brojLajkova = brojLajkova + 1;
    }

    public void dislike() {
        brojLajkova = brojLajkova - 1;
        if (brojLajkova < 0) {
            brojLajkova = 0;
        }


    }public void share(){brojDeljenja = brojDeljenja + 1;}
    public void print() {
        System.out.println(posiljaoc + ">>>" + primaoc ); System.out.println();
        System.out.println(tekst);
        System.out.println();
        System.out.println("Likes " + brojLajkova + " | " + "Shares " + brojDeljenja);
    }

}
