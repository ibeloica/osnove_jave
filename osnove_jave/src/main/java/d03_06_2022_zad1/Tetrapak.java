package d03_06_2022_zad1;

public class Tetrapak extends Ambalaza {

//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak(String barkod, String artikl, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, artikl, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiSeReciklira = true) {
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else return this.osnovnaCena;
    }

        @Override
        public void stampaj () {
            System.out.println("Barkod: " + this.barkod);
            System.out.println("Artikl: " + this.artikl);
            System.out.println("Bruto:" + this.brutoTezina);
            System.out.println("Neto: " + this.netoTezina);
            System.out.println("Reciklira se: " + this.daLiSeReciklira);
            System.out.println("Osnovna cena: " + this.getOsnovnaCena());
            System.out.println("Cena artikla je: " + this.cenaArtikla());

        }
    }
