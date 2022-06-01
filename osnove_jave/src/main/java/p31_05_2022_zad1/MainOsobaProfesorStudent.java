package p31_05_2022_zad1;

public class MainOsobaProfesorStudent {
    public static void main(String[] args) {

        Student pera = new Student("Pera Peric", "121283", "568", 1000);
        Student zika = new Student("Zivota Radmilovic", "131350", "750", 10000);

        pera.stampaj();
        pera.uplatiSkolarinu(500);
        pera.stampaj();

        Profesor milan = new Profesor("Milan Milan", "5678567", "QA", 50000.0);
        milan.stampaj();
        milan.povecajPlatu(30);
        milan.stampaj();


    }
}
