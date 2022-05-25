package d24_05_2022;

public class ZeleniKarton {

//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime

    private String imePrezimeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton() {
        this.imePrezimeStudenta = "Nikola Teslic";
        this.brojIndeksa = "56802";
        this.imePrezimeProfesora = "Mile Damnjanovic";

    }

    public ZeleniKarton(String imePrezimeStudenta, String brojIndeksa, String nazivPredmeta,
                        String imePrezimeProfesora, int ocena) {
        this.imePrezimeStudenta = "Nikola Teslic";
        this.brojIndeksa = "56802";
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = "Mile Damnjanovic";
        this.ocena = ocena;
    }

    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }


    public String getBrojIndeksa() {
        return brojIndeksa;
    }


    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }


    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozenIspit() {
        if (this.ocena > 5) {
            return true;
        } else return false;
    }

    public void stampaj() {
        System.out.println("(" + this.nazivPredmeta + ")" + " - " + "(" + this.ocena + ")");
        System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imePrezimeProfesora);
    }
}
