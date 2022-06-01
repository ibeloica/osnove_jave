package p30_05_2022_zad4;

public class InstagramTag {

//    Kreirati klasu InstagramTag koja ima:
//    x koordinatu na slici
//    y koordinatu na slici
//    usera koji je tagovan

    private int tackaX;
    private int tackaY;
    private InstagramUser user;

    public InstagramTag(int tackaX, int tackaY, InstagramUser user) {
        this.tackaX = tackaX;
        this.tackaY = tackaY;
        this.user = user;

    }

    public int getTackaX() {
        return tackaX;
    }

    public void setTackaX(int tackaX) {
        this.tackaX = tackaX;
    }

    public int getTackaY() {
        return tackaY;
    }

    public void setTackaY(int tackaY) {
        this.tackaY = tackaY;
    }

    public InstagramUser getUser() {
        return user;
    }

    public void setUser(InstagramUser user) {
        this.user = user;
    }

    public void stampaj() {
        System.out.println("Korisnik " + this.user + " " +
                "je tagovan na koordinatama x: " + this.tackaX + ", y: " + this.tackaY);
    }
}
