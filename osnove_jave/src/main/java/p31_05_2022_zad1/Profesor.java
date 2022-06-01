package p31_05_2022_zad1;

public class Profesor extends Osoba {

//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati implementaciju metode stampaj da stampa sve podatke o profesoru

    private String predmet;
    private double plata;

    public Profesor(String imePrezime, String jmbg, String predmet, double plata) {
        super(imePrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPlatu(double procenat) {
        this.plata = this.plata + (this.plata * procenat / 100);
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("predmet: " + this.predmet);
        System.out.println("plata: " + this.plata);
    }
}
