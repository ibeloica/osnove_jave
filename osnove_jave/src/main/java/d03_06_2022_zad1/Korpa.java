package d03_06_2022_zad1;

import java.util.ArrayList;

public class Korpa {

//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.


    public Korpa() {

    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = ambalaze.size() - 1; i >= 0; i--) {
            if (ambalaze.get(i).getBarkod().equals(barkod)) {
                ambalaze.remove(i);
            }

        }
    }

    private double ambalazeSaPopustom(double popust) {
        double cena = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cena += ambalaze.get(i).cenaArtikla();
        }
        return cena - popust;
    }
    public double cenaKorpe(SuperKartica superKartica) {
        return this.ambalazeSaPopustom(superKartica.getPopust());
    }


}
