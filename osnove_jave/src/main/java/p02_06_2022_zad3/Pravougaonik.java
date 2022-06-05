package p02_06_2022_zad3;

public class Pravougaonik extends Figura{

//    Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//    stranice a i b
//    gettere/settere/konstruktore
//    implementira metodu povrsina
//    implementira metodu obim

    private int stranicaA;
    private int stranicaB;

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return stranicaA * stranicaB;
    }

    @Override
    public double obim() {
        return 2*stranicaA + 2*stranicaB;
    }
}
