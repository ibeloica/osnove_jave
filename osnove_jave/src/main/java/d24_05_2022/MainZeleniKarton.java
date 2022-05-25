package d24_05_2022;

import java.util.ArrayList;

public class MainZeleniKarton {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();

        ZeleniKarton karton1 = new ZeleniKarton();
        karton1.setNazivPredmeta("Sociologija");
        karton1.setOcena(7);
        ZeleniKarton karton2 = new ZeleniKarton();
        karton2.setNazivPredmeta("Matematika");
        karton2.setOcena(9);
        ZeleniKarton karton3 = new ZeleniKarton();
        karton3.setNazivPredmeta("Likovno");
        karton3.setOcena(5);
        ZeleniKarton karton4 = new ZeleniKarton();
        karton4.setOcena(8);
        karton4.setNazivPredmeta("Crtanje");
        ZeleniKarton karton5 = new ZeleniKarton();
        karton5.setNazivPredmeta("Fizicko");
        karton5.setOcena(10);
        ZeleniKarton karton6 = new ZeleniKarton();
        karton6.setOcena(5);
        karton6.setNazivPredmeta("Kvantna fizika");
        ZeleniKarton karton7 = new ZeleniKarton();
        karton7.setOcena(9);
        karton7.setNazivPredmeta("Astrologija");
        ZeleniKarton karton8 = new ZeleniKarton();
        karton8.setOcena(5);
        karton8.setNazivPredmeta("Osnovi ekonomije");
        ZeleniKarton karton9 = new ZeleniKarton();
        karton9.setOcena(10);
        karton9.setNazivPredmeta("Strpljenje");
        ZeleniKarton karton10 = new ZeleniKarton();
        karton10.setNazivPredmeta("Muzicko");
        karton10.setOcena(6);

        karton1.stampaj();
        karton2.stampaj();
        karton3.stampaj();
        karton4.stampaj();
        karton5.stampaj();
        karton6.stampaj();
        karton7.stampaj();
        karton8.stampaj();
        karton9.stampaj();
        karton10.stampaj();


        zeleniKartoni.add(karton1);
        zeleniKartoni.add(karton2);
        zeleniKartoni.add(karton3);
        zeleniKartoni.add(karton4);
        zeleniKartoni.add(karton5);
        zeleniKartoni.add(karton6);
        zeleniKartoni.add(karton7);
        zeleniKartoni.add(karton8);
        zeleniKartoni.add(karton9);
        zeleniKartoni.add(karton10);

        double ukupnaProsecnaOcena = 0;
        int suma = 0;
        int sumaPolozenih = 0;
        int brojPolozenih = 0;
        double prosecnaOcenaPolozenih = 0;

        for (int i = 0; i < zeleniKartoni.size(); i++) {

            suma = suma + zeleniKartoni.get(i).getOcena();
            ukupnaProsecnaOcena = suma * 1.0 / zeleniKartoni.size();

            if (zeleniKartoni.get(i).polozenIspit()) {
                sumaPolozenih = sumaPolozenih + zeleniKartoni.get(i).getOcena();
                brojPolozenih++;
                prosecnaOcenaPolozenih = sumaPolozenih * 1.0 / brojPolozenih;
            }


        }
        System.out.println();
        System.out.println("Prosecna ocena svih ispita je: " + ukupnaProsecnaOcena);
        System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenih);

    }
}
