package p30_05_2022_zad4;

public class InstagramUser {

//    4.Zadatak(Za vezbanje)
//    Kreirati klasu InstagramUser koja ima:
//    username
//    Ime i prezime
//            email
//    Sve sto vam dalje zatreba dopunite klasu.

    private String username;
    private String imePrezime;
    private String email;

    public InstagramUser(String username, String imePrezime, String email) {
        this.username = username;
        this.imePrezime = imePrezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void stampaj(){
        System.out.println("Korisnik: " + this.username );
        System.out.println("Ime i prezime: " + this.imePrezime);
        System.out.println("Email: " + this.email);
    }
}
