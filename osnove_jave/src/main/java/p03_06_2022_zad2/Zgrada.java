package p03_06_2022_zad2;

public class Zgrada extends Objekat{

//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

    private int brojStanova;

    public Zgrada(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return koeficijent() * povrsina * brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina:" + povrsina);
        System.out.println("Zona: " + zona);
        System.out.println("Broj stanova: " + brojStanova);
        System.out.println("Porez je: " + this.porez());

    }
}
