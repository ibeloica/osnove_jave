package d30_05_2022_zad1;

public class Ispit {

//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    private String predmet;
    private double ocena;
    private String profesor;

    public Ispit(){}

    public Ispit(String predmet, double ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean daLiJePolozen(double ocena) {
        if (ocena > 5) {
            return true;
        } else return false;
    }

    public void stampaj() {
        System.out.println("(" + this.predmet + ")" + " - " +
                "(" + this.profesor + ")" + " - " + "(" + this.ocena + ")");
    }

}
