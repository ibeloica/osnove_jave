package p03_06_2022_zad2;

public class Kuca extends Objekat{

//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    private int brojClanova;

    public Kuca(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return koeficijent() * povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina:" + povrsina);
        System.out.println("Zona: " + zona);
        System.out.println("Broj clanova: " + brojClanova);
        System.out.println("Porez je: " + this.porez());

    }
}
