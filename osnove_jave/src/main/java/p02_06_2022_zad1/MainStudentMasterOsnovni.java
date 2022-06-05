package p02_06_2022_zad1;

public class MainStudentMasterOsnovni {
    public static void main(String[] args) {

        StudentMaster milan = new StudentMaster("Milan Ilic", "123456", 3);
        milan.naBudzetu();
        milan.cenaSkolarine();
        milan.stampaj();

        StudentOsnovnih dragan = new StudentOsnovnih("Gagi Gagic", "654321", 1);

        dragan.naBudzetu();
        dragan.cenaSkolarine();
        dragan.stampaj();
    }
}
