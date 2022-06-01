package p31_05_2022_zad1;

public class Osoba {

//    Zadatak
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg

    protected String imePrezime;
    protected String jmbg;

    public Osoba(String imePrezime, String jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }
    public void stampaj(){
        System.out.println(imePrezime + ", " + jmbg);
    }
}
