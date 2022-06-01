package p31_05_2022_zad2;

public class MainPlatnaVisaMaster {
    public static void main(String[] args) {

        VisaKartica visa1 = new VisaKartica(10000, "160-242-30",
                2022, 11, "Mile Ilic");

        visa1.stampaj();
        visa1.dodajSredstva(10000);
        visa1.izvrsiTransakciju(5000);
        visa1.stampaj();

        MasterKartica master1 = new MasterKartica(10000, "160-242-30",
                2022, 5);
        master1.stampaj();
        master1.dodajSredstva(5000);
        master1.izvrsiTransakciju(3500);
        master1.stampaj();






    }
}
