package p30_05_2022_zad1;

public class MainPastaSastojak {
    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("kajmak", 60);
        Sastojak s2 = new Sastojak("pecenica", 100);
        Sastojak s3 = new Sastojak("pecurke", 120);

        Pasta p1 = new Pasta();
        p1.dodajSastojak(s1);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s3);


        p1.stampaj();
        p1.obrisiSastojak(s2);
        p1.stampaj();

    }
}
