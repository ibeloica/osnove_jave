package p23_05_2022;

public class MainFilmReziser {
    public static void main(String[] args) {

        Film film1 = new Film();
        film1.setNaziv("Odiseja2001");
        film1.setGodinaProizvodnje(1968);
        film1.stampaj();

        Reziser reziser1 = new Reziser();
        reziser1.setImePrezime("Stenli Kjubrik");
        reziser1.setStarost(71);
        reziser1.stampaj();
    }
}
