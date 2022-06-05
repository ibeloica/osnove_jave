package d30_05_2022_zad1;

import java.util.ArrayList;

public class Student {

//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private String brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public Student(String brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        ispiti.add(ispit);
    }

    public double prosekPolozenih() {
        int polozeniIspiti = 0;
        double suma = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).getOcena() > 5) {
                suma = suma + ispiti.get(i).getOcena();
                polozeniIspiti++;



            }


        }return suma / polozeniIspiti;



    }

    public void stampaj() {
        System.out.println("(" + brojIndeksa + ")" + " - " + "(" + imePrezime + ")" + " - " + "(" + tipStudija + ")");
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            System.out.print("(" + ispiti.get(i).getPredmet() + ")" + " - ");
            System.out.print("(" + ispiti.get(i).getProfesor() + ")" + " - ");
            System.out.println("(" + ispiti.get(i).getOcena() + ")");

        }
        System.out.println("Prosecna ocena: " + prosekPolozenih());
    }
}
