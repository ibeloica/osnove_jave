package d30_05_2022_zad1;

import p31_05_2022_zad1.Profesor;

public class MainStudentIspit {
    public static void main(String[] args) {

        Student s1 = new Student("568", "Pera Peric", "osnovni");
        Student s2 = new Student("879", "Iga Igic", "master");
        Ispit i1 = new Ispit("likovno", 7, "Mile Ilic");
        Ispit i2 = new Ispit("muzicko", 9, "Jana Ilic");
        Ispit i3 = new Ispit("informatika", 5, "Beki Bekic");
        Ispit i4 = new Ispit("ekonomija", 10, "Paja Jaric");
        Ispit i5 = new Ispit("istorija", 5, "Ana Peric");
        Ispit i6 = new Ispit("pravo", 8, "Toma Fila");
        Ispit i7 = new Ispit("fizika", 9, "Maja Jokic");

        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s1.dodajIspit(i4);
        s1.dodajIspit(i5);
        s1.dodajIspit(i6);
        s1.dodajIspit(i7);

        s1.stampaj();



    }
}
