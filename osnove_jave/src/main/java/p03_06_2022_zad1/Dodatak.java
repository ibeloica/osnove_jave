package p03_06_2022_zad1;

public class Dodatak {

//    1. Zadatak
//    Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
//    Npr: Ice point vanila sa dodacima: plazma, cokolada
//    Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
//
//    Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//    naziv dodatka
//    cenu dodatka
//    konstruktore, gettere i settere koji su vam potrebni
//    metodu stampaj koja stampa u formatu:
//            (dodatak)  (cena)

    protected String naziv;
    protected int cena;

    public Dodatak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Dodatak() {

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampaj(){
        System.out.println("("+ naziv + ") " + " (" + cena +") ");
    }

}
