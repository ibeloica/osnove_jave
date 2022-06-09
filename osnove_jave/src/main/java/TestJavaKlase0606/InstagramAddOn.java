package TestJavaKlase0606;

public abstract class InstagramAddOn {
//    Kreirati apstraktnu klasu InstagramAddOn za potrebe ukljucivanja dodataka na stori koja ima:
//    id - jedinstveni identifikator koji moze da bude po zelji broj ili neki tekstualni kod
//    x i y koordinatu - sluze da odrede poziciju dodataka u okviru storija
//    sirinu dodatka
//    visinu dodatka
//    getere za sve atribute
//    nemamo settere
//    konstuktor koji je potreban (potrebno je zakljuciti koji konstruktor jedino ima smisla da postoji)
//
//    - apstraktnu metodu koja vraca minimalnu sirinu dodatka
//    - apstraktnu metodu koja vraca minimalnu visinu dodatka
//    - metodu za povecanje dimenzija. Metoda prima dva parametra,
//    jedan za povecanje visine a drugi za povecanje sirine dodatka.
//    - metodu za smanjenje dimenzija.Metoda prima dva parametra,
//    jedan za smanjenje visine a drugi za smanjenje sirine.
//    - Duzina i visina ne mogu da spadnu ispod minimalnih vrednosti dodatka.
//    apstraktnu metodu za stampu

    protected String id;
    protected int xTacka;
    protected int yTacka;
    protected int sirinaDodatka;
    protected int visinaDodatka;

    public InstagramAddOn(String id, int xTacka, int yTacka, int sirinaDodatka, int visinaDodatka) {
        this.id = id;
        this.xTacka = xTacka;
        this.yTacka = yTacka;
        this.sirinaDodatka = sirinaDodatka;
        this.visinaDodatka = visinaDodatka;
    }

    public String getId() {
        return id;
    }

    public int getxTacka() {
        return xTacka;
    }

    public int getyTacka() {
        return yTacka;
    }

    public int getSirinaDodatka() {
        return sirinaDodatka;
    }

    public int getVisinaDodatka() {
        return visinaDodatka;
    }

    public abstract int minSirinaDodatka();

    public abstract int minVisinaDodatka();

    public void povecajDimenzije(int povecajVisinu, int povecajSirinu) {
        visinaDodatka += povecajVisinu;
        sirinaDodatka += povecajSirinu;
    }

    public void smanjiDimenzije(int smanjiVisinu, int smanjiSirinu) {
        visinaDodatka -= smanjiVisinu;
        if (smanjiVisinu < minVisinaDodatka()) {
            visinaDodatka = minVisinaDodatka();
        }
        sirinaDodatka -= smanjiSirinu;
        if (smanjiSirinu < minSirinaDodatka()) {
            sirinaDodatka = minSirinaDodatka();
        }
    }

    public abstract void stampaj();
}
