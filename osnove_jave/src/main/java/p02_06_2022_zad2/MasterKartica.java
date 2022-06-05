package p02_06_2022_zad2;

public class MasterKartica extends PlatnaKartica {

//    Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//    konstruktor sa parametrima
//    implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//    metoda naplatiOdrzavanje, koja sa racuna skida $2.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Master Card: 12/2019, 4012-1239-1221-3381, $232
//    u main funkciji, napraviti visa i master kartice i testirati funkcije


    public MasterKartica() {
    }

    public MasterKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
    }

    @Override
    public void izvrsiTransakciju(double transakcija) {
        this.suma = this.suma + this.suma * 1.5 / 100;
    }

    public void naplatiOdrzavanje() {
        suma = suma - 2;
    }

    @Override
    public void stampaj() {
        System.out.print("Master Card: ");
        System.out.println(this.brojKartice + ", " + mesecVazenja + "/" + godinaVazenja + " $" + this.suma);

    }
}
