package p02_06_2022_zad4;

public class VideoPlayer {

//    4.Zadatak  (ZA VEZBANJE)
//    Kreirati klasu VideoPlayer koja ima:
//    duzinu videa
//    trenutno vreme videa
//    jacinu zvuka
//    Kvalitet videa (144, 240, 360, 480, 720, 1080)
//    gettere, settere i konstruktore
//    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa

    protected int duzinaVidea;
    protected int trenutnoVreme;
    protected int jacinaZvuka;
    protected String kvalitet;

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, String kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public String getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(String kvalitet) {
        this.kvalitet = kvalitet;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme: " + trenutnoVreme);
        System.out.println("Jacina zvuka: " + jacinaZvuka);
        System.out.println("Kvalitet: " + kvalitet);
    }
}
