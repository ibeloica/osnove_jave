package p03_06_2022_zad2;

public class Lokal extends Objekat{

//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal


    public Lokal() {
    }

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porez() {
        return koeficijent() * povrsina * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Povrsina:" + povrsina);
        System.out.println("Zona: " + zona);
        System.out.println("Porez je: " + this.porez());
    }
}
