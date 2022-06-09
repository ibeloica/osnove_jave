package TestJavaKlase0606;

import java.sql.Array;
import java.util.ArrayList;

public class InstagramStory {

//    (30 poena) Kreirati klasu InstagramStory koja ima:
//    autor storija- korisnik koji je kreirao stori
//    link za swipe up
//    link do slike (npr: https://www.instagram.com/p/CecrcPyrPMj/  )
//            niz dodataka na stori
//            niz korisnika - cuvamo podatke ko je sve pogledao stori
//            gettere za sve atribute
//            setter samo za swipe up link
//            konstuktore koji su vam potrebi
//            metodu za dodavanje dodatka na stori
//            metodu za brisanje dodatka sa storija.
//            Metodi se prosledjuje id dodatka koji je potrebno izbaciti.
//
//            private metodu koja proverava da li je korisnik sa datim username-om vec pogledao stori.
//            Metoda kao parametar prima username i vraca da li je korisnik pogledao stori ili ne
//
//            metodu pogledaj stori. Metoda kao parametar prima korisnika i dodaje ga u niz korisnika
//            koji su pogledali stori samo ako nije pogledao pre toga
//
//            metodu za postavljanje storia. Metoda stampa autora i niz dodataka.
//            Ukoliko postoji link za swipe up na dnu stampa odstampajte swipe up zajedno sa linkom,
//            ukoliko ne postoji tada se nista ne stampa
//
//
//
//
//
//
//
//                           Primer stampe:
//                           @milan	Milan Jovanovic
//                           Story:
//                           Image: https://www.instagram.com/p/CecrcPyrPMj/
//                           [10, 15] (70, 120) L Kej
//[4, 1] (60, 120) @pera/https://www.instagram.com/pera/
//            [x, y] (60, 100) @mika/https://www.instagram.com/mika/
//            <<< swipe up >>>
//    http://google.com/
//
//    metodu koja vraca broj pregleda
//    metodu koja stampa sve korisnike koji su pogledali stori u formatu:
//    Viewers 3
//    @milan	Milan Jovanovic
//    @stefan13	Stefan Stefanovic
//    @pera Pera	Peric

    protected InstagramUser autorStory;
    protected String swipeUp;
    protected String linkDoSlike;

    protected ArrayList<InstagramAddOn> addOns = new ArrayList<>();
    protected ArrayList<InstagramUser> korisnici = new ArrayList<>();

    public InstagramStory(InstagramUser autorStory, String swipeUp, String linkDoSlike) {
        this.autorStory = autorStory;
        this.swipeUp = swipeUp;
        this.linkDoSlike = linkDoSlike;
    }

    public InstagramUser getAutorStory() {
        return autorStory;
    }

    public String getSwipeUp() {
        return swipeUp;
    }

    public String getLinkDoSlike() {
        return linkDoSlike;
    }

    public ArrayList<InstagramAddOn> getAddOns() {
        return addOns;
    }

    public ArrayList<InstagramUser> getKorisnici() {
        return korisnici;
    }

    public void setSwipeUp(String swipeUp) {
        this.swipeUp = swipeUp;
    }

    public void dodajAddons(InstagramAddOn addOn) {
        this.addOns.add(addOn);
    }

    public void obrisiAddons(String id) {
        for (int i = 0; i < this.addOns.size(); i++) {
            if (this.addOns.get(i).getId() == id) {
                this.addOns.remove(i);
            }
        }
    }

    private boolean daLiJePogledaoStory(InstagramUser username) {
        for (int i = 0; i < this.korisnici.size(); i++) {
            if (this.korisnici.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void pogledajStory(InstagramUser instagramUser) {
        if (this.daLiJePogledaoStory(instagramUser) == false)
            korisnici.add(instagramUser);
    }

    public void postaviStory() {
        System.out.println(autorStory);
        System.out.println(addOns);
        System.out.println("<<< swipe up >>>");
        System.out.println(swipeUp);
    }

    public void brojPregleda() {
        int brojPregleda = 0;
        for (int i = 0; i < korisnici.size(); i++) {
            brojPregleda += korisnici.size();

        }
    }
}

