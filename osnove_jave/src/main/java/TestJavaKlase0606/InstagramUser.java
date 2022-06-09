package TestJavaKlase0606;

public class InstagramUser {

//    Zadatak
//            (15 poena) Kreirati klasu InstagramUser koja ima:
//    username korisnika
//    ime i prezime
//    konstuktor koji postavlja samo username
//    konstuktor koji postavlja sve atribute
//    gettere za sve atribute
//    settere za sve atribute osim username-a
//    metodu za stampu koja stampa podatke korisnika u jednom redu:
//    @username \t ime i prezime
//    metodu koja generise link do korisnickog profila.Metoda generise i vraca string u formatu:
//    https://www.instagram.com/[username]/
//    Npr:za username pera, metoda vraca string https://www.instagram.com/pera/

    protected String username;
    protected String imePrezime;

    public InstagramUser(String username) {
        this.username = username;
    }

    public InstagramUser(String username, String imePrezime) {
        this.username = username;
        this.imePrezime = imePrezime;
    }

    public String getUsername() {
        return username;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void stampaj() {
        System.out.println("@" + this.username + "\t" + this.imePrezime);
    }

    public String linkDoProfila() {
        return
                "https://www.instagram.com/" + this.username;
    }
}
