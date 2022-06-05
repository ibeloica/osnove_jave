package d03_06_2022_zad1;

public class StaklenaAmbalaza extends Ambalaza {

//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

    private double kaucija;
    private boolean daLiKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String artikl, double netoTezina, double brutoTezina,
                            double kaucija, boolean daLiKaucija, double osnovnaCena) {
        super(barkod, artikl, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiKaucija = daLiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiKaucija() {
        return daLiKaucija;
    }

    public void setDaLiKaucija(boolean daLiKaucija) {
        this.daLiKaucija = daLiKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiKaucija = true) {
            return osnovnaCena * 1.2 + kaucija;
        } else return osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Artikl: " + this.artikl);
        System.out.println("Bruto:" + this.brutoTezina);
        System.out.println("Neto: " + this.netoTezina);
        System.out.println("Kaucija: " + this.kaucija);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena artikla je: " + this.cenaArtikla());

    }
}
