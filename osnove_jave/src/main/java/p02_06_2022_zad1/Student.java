package p02_06_2022_zad1;

public abstract class Student {

//    1.Zadatak
//
//    Kreirati apstraktnu klasu Student koja ima:
//    ime i prezime studenta
//    broj indeksa
//    godinu studija
//    gettere, settere i konstruktore
//    apstraktnu metodu koja racuna i vraca cenu skolarine.
//    metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//    metodu koja stampa podatke u formatu:
//    ime i prezime, broj indeksa, godina studija
//    Finansiranje: budzet/samofinansirajuci
//    Cena skolarine: cena

    protected String imePrezime;
    protected String brojIndexa;
    protected int godinaStudija;

    public Student(){}

    public Student(String imePrezime, String brojIndexa, int godinaStudija) {
        this.imePrezime = imePrezime;
        this.brojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract double cenaSkolarine();

    public abstract  boolean naBudzetu();

    public void stampaj(){
        System.out.println(imePrezime + ", " + brojIndexa + ", " + godinaStudija);
        System.out.println("Finansiranje: " + naBudzetu());
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }
}
