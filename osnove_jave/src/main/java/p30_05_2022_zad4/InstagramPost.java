package p30_05_2022_zad4;

import java.util.ArrayList;

public class InstagramPost {

//    Kreirati klasu InstagramPost koja ima
//    niz slika
//    Opis koji moze da se postavi za post
//    metodu dodajSliku

    private ArrayList<InstagramImage> nizSlika = new ArrayList<>();
    private String opisPosta;

    public InstagramPost(ArrayList<InstagramImage> nizSlika, String opisPosta) {
        this.nizSlika = nizSlika;
        this.opisPosta = opisPosta;
    }

    public ArrayList<InstagramImage> getNizSlika() {
        return nizSlika;
    }

    public void setNizSlika(ArrayList<InstagramImage> nizSlika) {
        this.nizSlika = nizSlika;
    }

    public String getOpisPosta() {
        return opisPosta;
    }

    public void setOpisPosta(String opisPosta) {
        this.opisPosta = opisPosta;
    }

    public void dodajSliku(InstagramImage instagramImage) {
        this.nizSlika.add(instagramImage);
    }

    public void stampaj() {
        System.out.println("Instagram post sa opisom: " + this.opisPosta);
        System.out.println("Sadrzi " + this.nizSlika);
    }


}
