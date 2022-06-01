package p31_05_2022_zad1;

public class Student extends Osoba {

//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
//    Metoda prima iznos uplate kao parametar metode.
//    Napisati implementaciju metode stampaj da stampa sve podatke o studentu

    private String brojIndexa;
    private int dug;

    public Student(String imePrezime, String jmbg, String brojIndexa, int dug) {
        super(imePrezime, jmbg);
        this.brojIndexa = brojIndexa;
        this.dug = dug;
    }

    public void uplatiSkolarinu(int uplata) {
        this.dug = this.dug - uplata;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("broj indexa: " + this.brojIndexa);
        System.out.println("dug je: " + this.dug);
    }
}
