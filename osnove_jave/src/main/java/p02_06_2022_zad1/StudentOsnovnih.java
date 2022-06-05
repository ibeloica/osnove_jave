package p02_06_2022_zad1;

public class StudentOsnovnih extends Student {

//    Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 90000
//    za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//    stampajte podatke po izboru


    public StudentOsnovnih() {
    }

    public StudentOsnovnih(String imePrezime, String brojIndexa, int godinaStudija) {
        super(imePrezime, brojIndexa, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        if (godinaStudija < 5) {
            return true;
        }return false;
    }
}
