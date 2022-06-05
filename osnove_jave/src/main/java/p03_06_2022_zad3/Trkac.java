package p03_06_2022_zad3;

public class Trkac extends Atleticar {

    public Trkac(String imePrezime, double rezultat) {
        super(imePrezime, rezultat);
    }

    @Override
    public boolean dalijeBolji(Atleticar atleticar) {
        if (this.rezultat < atleticar.rezultat)
            return true;
        return false;
    }
}


