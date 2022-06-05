package Vezbanje05062022;

public class Alpinista extends Planinar{
//    (20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
//    Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
//    i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara,
//    placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
//    a informacije o alpinisti se ispisuju u formatu:
//    Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)

    private int poeni;

    public Alpinista(int idPlaninara, String imePlaninara, int poeni) {
        super(idPlaninara, imePlaninara);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, ID: " + this.idPlaninara);
        System.out.println("Ime: " + this.imePlaninara);
        System.out.println("Broj poena: " + this.poeni);

    }

    @Override
    public double clanarina() {
        return 1500 - (this.poeni * 50);
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return planina.getVisinaPlanine()<4000;
    }
}
