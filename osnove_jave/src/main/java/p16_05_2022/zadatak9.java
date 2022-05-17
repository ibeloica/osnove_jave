package p16_05_2022;

public class zadatak9 {
    public static void main(String[] args) {

//        9.Zadatak
//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        6 - VI
//        7 - VII
//        8 - VIII
//        9 - IX
//        10 - X
//
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//                Ako se unese VIII vraca se 8.
//
//        VIII => 8

        System.out.println(arapski("VI"));


    }

    static int arapski(String broj) {
        if (broj.equals("I")) {
            return 1;
        }
        if (broj.equals("II")) {
            return 2;
        }
        if (broj.equals("III")) {
            return 3;
        }
        if (broj.equals("IV")) {
            return 4;
        }
        if (broj.equals("V")) {
            return 5;
        }
        if (broj.equals("VI")) {
            return 6;
        }
        if (broj.equals("VII")) {
            return 7;
        }
        if (broj.equals("VIII")) {
            return 8;
        }
        if (broj.equals("IX")) {
            return 9;
        }
        if (broj.equals("X")) {
            return 10;
        } else return -1;
    }
}
