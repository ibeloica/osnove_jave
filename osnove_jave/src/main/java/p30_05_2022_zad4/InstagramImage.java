package p30_05_2022_zad4;

import java.util.ArrayList;

public class InstagramImage {

//    Kreirati klasu InstagramImage koja ima:
//    niz tagova
//    dimenziju slike
//    putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//    metodu dodajTag

    private ArrayList<InstagramTag> nizTagova = new ArrayList<>();
    private String dimenzijaSlike;
    private String linkDoSlike;

    public InstagramImage(ArrayList<InstagramTag> nizTagova, String dimenzijaSlike, String linkDoSlike) {
        this.nizTagova = nizTagova;
        this.dimenzijaSlike = dimenzijaSlike;
        this.linkDoSlike = linkDoSlike;
    }

    public ArrayList<InstagramTag> getNizTagova() {
        return nizTagova;
    }

    public void setNizTagova(ArrayList<InstagramTag> nizTagova) {
        this.nizTagova = nizTagova;
    }

    public String getDimenzijaSlike() {
        return dimenzijaSlike;
    }

    public void setDimenzijaSlike(String dimenzijaSlike) {
        this.dimenzijaSlike = dimenzijaSlike;
    }

    public String getLinkDoSlike() {
        return linkDoSlike;
    }

    public void setLinkDoSlike(String linkDoSlike) {
        this.linkDoSlike = linkDoSlike;
    }

    public void dodajTag(InstagramTag instagramTag) {
        this.nizTagova.add(instagramTag);
    }
    public void stampaj(){
        System.out.println("Ova slika sadrzi tagove " + this.nizTagova );
        System.out.println("Dimenzije slike su " + this.dimenzijaSlike);
        System.out.println("Link do slike je " + this.linkDoSlike);
    }
}
