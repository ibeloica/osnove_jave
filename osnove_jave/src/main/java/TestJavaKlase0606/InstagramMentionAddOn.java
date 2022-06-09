package TestJavaKlase0606;

public class InstagramMentionAddOn extends InstagramAddOn {
//    (10 poena) Kreirati klasu InstagramMentionAddOn koja nasledjuje  InstagramAddOn klasu i ima:
//    korisnika koji je tagovan
//    konstuktor koji je potreban
//    getter i setter za tagovanog korisnika
//    minimalna visina za lokaciju je 50 a duzina 80
//    stampanje se vrsi u formatu:
//            [x, y] (visina, sirina) @username/link do korisnickog profila

    protected InstagramUser tagovanKorisnik;

    public InstagramMentionAddOn(String id, int xTacka, int yTacka, int sirinaDodatka,
                                 int visinaDodatka, InstagramUser tagovanKorisnik) {
        super(id, xTacka, yTacka, sirinaDodatka, visinaDodatka);
        this.tagovanKorisnik = tagovanKorisnik;
    }

    public InstagramUser getInstagramUser() {
        return tagovanKorisnik;
    }

    public void setInstagramUser(InstagramUser tagovanKorisnik) {
        this.tagovanKorisnik = tagovanKorisnik;
    }

    @Override
    public int minSirinaDodatka() {
        return 80;
    }

    @Override
    public int minVisinaDodatka() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.xTacka + ", " + this.yTacka + "]" +
                " (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") "
                + "@" + this.tagovanKorisnik.username + "/" + tagovanKorisnik.linkDoProfila());

    }
}
