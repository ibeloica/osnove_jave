package TestJavaKlase0606;

public class InstagramLocationAddOn extends InstagramAddOn {
//    (10 poena) Kreirati klasu InstagramLocationAddOn koja nasledjuje InstagramAddOn klasu i ima:
//    naziv lokacije
//    konstuktor koji je potreban
//    getter i setter za lokaciju
//    minimalna visina za lokaciju je 50 a duzina 100
//    stampanje se vrsi u formatu:
//            [x, y] (visina, sirina) L naziv lokacije

    protected String nazivLokacije;

    public InstagramLocationAddOn(String id, int xTacka, int yTacka, int sirinaDodatka, int visinaDodatka, String nazivLokacije) {
        super(id, xTacka, yTacka, sirinaDodatka, visinaDodatka);
        this.nazivLokacije = nazivLokacije;
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public int minVisinaDodatka() {
        return 50;
    }

    @Override
    public int minSirinaDodatka() {
        return 100;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.xTacka + ", " + this.yTacka + "]" +
                " (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") " + "L " + this.nazivLokacije);
    }
}