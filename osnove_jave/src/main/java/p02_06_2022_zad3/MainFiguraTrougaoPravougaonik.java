package p02_06_2022_zad3;

import java.util.ArrayList;

public class MainFiguraTrougaoPravougaonik {
    public static void main(String[] args) {

//        U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
//        zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob

        ArrayList<Figura> figure = new ArrayList<Figura>();
        Figura f1 = new JednakostranicniTrougao(5);
        Figura f2 = new JednakostranicniTrougao(3);
        Figura f3 = new Pravougaonik(2, 4);
        Figura f4 = new Pravougaonik(3, 6);
        Figura f5 = new Pravougaonik(4, 7);

        figure.add(f1);
        figure.add(f2);
        figure.add(f3);
        figure.add(f4);
        figure.add(f5);

        double sumaPov = 0;
        for (int i = 0; i < figure.size(); i++) {
            sumaPov += figure.get(i).povrsina();


        }System.out.println("Suma povrsina je " + sumaPov);


        double sumaObim = 0;
        for (int i = 0; i < figure.size(); i++) {
            sumaObim += figure.get(i).obim();


        }System.out.println("Suma obima je " + sumaObim);


        System.out.println();


        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }

    }

}

