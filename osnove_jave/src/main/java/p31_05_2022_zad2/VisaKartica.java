package p31_05_2022_zad2;

public class VisaKartica extends PlatnaKartica {

//    Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//    ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//    getter i setter za ovlasceno lice
//    konstruktor sa parametrima
//    implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
//    Najmanja provizija moze biti $4.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Visa Card: 4012-1239-1221-3381, 11/2019, $212

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(int suma, String brojKartice, int godinaVaznosti, int mesecVaznosti, String ovlascenoLice) {
        super(suma, brojKartice, godinaVaznosti, mesecVaznosti);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(int isplata) {
        super.izvrsiTransakciju(isplata);

        double provizija = this.suma * 1.8 / 100;
        this.suma = this.suma + provizija;
        if (provizija < 4) {
            provizija = 4;
        }
    }

    @Override
    public void stampaj() {
        System.out.print("Visa Card: ");
        super.stampaj();
    }
}
