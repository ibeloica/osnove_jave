package p02_06_2022_zad1;

public class StudentMaster extends Student {

//    Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//    U glavnoj klasi kreirati studente i testirati funkciolanosti


    public StudentMaster() {
    }

    public StudentMaster(String imePrezime, String brojIndexa, int godinaStudija) {
        super(imePrezime, brojIndexa, godinaStudija);
    }





    @Override
    public double cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        if (godinaStudija < 2) {
            return true;

        }
        return false;
    }
}
