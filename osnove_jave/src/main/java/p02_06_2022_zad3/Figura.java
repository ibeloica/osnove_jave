package p02_06_2022_zad3;

public abstract class Figura {

//    Kreirati abstraktnu klasu Figura koja ima
//    abstraktnu metodu povrsina
//    abstraktnu metodu obim
//    metodu koja stampa podatke u formatu:
//    Povrsina je (povrsina)
//    Obim je (obim)

    public abstract double povrsina();

    public abstract double obim();

    public void stampaj() {
        System.out.println("Povrsina je: " + povrsina());
        System.out.println("Obim je: " + obim());
    }


}
