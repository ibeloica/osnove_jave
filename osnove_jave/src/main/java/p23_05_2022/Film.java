package p23_05_2022;

public class Film {

//    1.Zadatak
//    Kreirati klasu Film koja ima:
//    naziv filma
//    iz koje godine je film
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    naziv filma, godina

    private String naziv;
    private int godinaProizvodnje;
    private Reziser reziser;

    public Film() {
    }

    public Film(String naziv, int godinaProizvodnje) {
        this.naziv = naziv;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaProizvodnje() {
        return this.godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void stampaj() {
        System.out.println(this.naziv + " , " + this.godinaProizvodnje);

    }

    public Reziser getReziser() {
        return this.reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }


}
