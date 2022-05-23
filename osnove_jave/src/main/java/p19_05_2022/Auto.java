package p19_05_2022;

import java.util.concurrent.LinkedTransferQueue;

public class Auto {

    public String vozac;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public int brzina;
    public String registracija;
    public boolean klima;
    public int godinaProizvodnje;
    public int mesecReg;
    public int trenutniMesec;
    public int kubikaza;


    public void stampanje() {
        System.out.println("Vozac je: " +this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata ");
        System.out.println("sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(this.brzina + " je trenutna brzina");
        System.out.println("Prekoracenje je: " + prekoracenje(80));
        System.out.println("Registracija : " + this.registracija);
        System.out.println("Trenutna potrosnja je " + trenutnaPotrosnja(this.klima));
        System.out.println("Da li je auto oldtajmer? " + oldTimer());
        System.out.println("Da li je istekla registracija? " + istekReg(trenutniMesec));
        System.out.println("Cena registracije je: " + cenaRegistracije());


    }

    public boolean prekoracenje(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else return false;


    }

    public int kazna(int ogranicenje) {
        if (brzina > ogranicenje) {
            return (brzina - ogranicenje) * 1000;
        } else return 0;

    }

    public void dodajGas(int brzina) {
        brzina = brzina + 10;
    }

    public int koci(int brzina) {
        if (brzina > koci(brzina)) {
            return brzina - 10;
        } else brzina = 0;
        return brzina;
    }

    public double trenutnaPotrosnja(boolean klima) {
        if (this.klima = true) {
            return (this.brzina / 100.0 * this.potrosnja) * 1.2;
        } else return (this.brzina / 100.0 * this.potrosnja) * 1.0;

    }

    public boolean oldTimer() {
        if (this.godinaProizvodnje < 1950) {
            return true;
        } else return false;
    }

    public boolean istekReg(int trenutniMesec) {
        if (mesecReg < trenutniMesec) {
            return true;
        } else return false;
    }

    public double cenaRegistracije() {
        if (kubikaza < 2000) {
            return
                    kubikaza * 100.0;
        } return kubikaza * 100.0 * 1.3;
    }
}