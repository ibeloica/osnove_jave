package p02_06_2022_zad2;

public class MainPlatnaVisaMaster {
    public static void main(String[] args) {

        VisaKartica v1 = new VisaKartica(10000.0, "150-254-30",
                2022, 11, "Milan Ilic");
        MasterKartica m1 = new MasterKartica(5000.0, "160-320-50",
                2022, 4);

        v1.stampaj();
        v1.dodajSredstva(5000.0);
        v1.izvrsiTransakciju(500.0);
        v1.stampaj();

        m1.stampaj();
        m1.dodajSredstva(10000.0);
        m1.izvrsiTransakciju(1000.0);
        m1.stampaj();
    }
}
