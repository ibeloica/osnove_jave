package p02_06_2022_zad3;

public class JednakostranicniTrougao extends Figura{
//    Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//    stranicu a
//    gettere/settere/konstruktore
//    implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//    implementira metodu obim

    private int stranicaA;

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return (stranicaA * stranicaA) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3 * stranicaA;
    }
}
