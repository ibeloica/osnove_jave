package d24_05_2022;

public class MainRacunTransakcija {
    public static void main(String[] args) {
        Racun uplatilac = new Racun("160-23456-30", "Mile Pajser", 10000);
        Racun primalac = new Racun("160-65432-75", "Djoka Bomba", 5000);
        uplatilac.stampaj();
        primalac.stampaj();
        System.out.println();

        Transakcija prva = new Transakcija(666);
        prva.setRacunPosiljaoca(uplatilac);
        prva.setRacunPrimaoca(primalac);
        prva.stampaj();
        prva.izvrsiTransakciju(1000);
        uplatilac.stampaj();
        primalac.stampaj();


    }
}
