package p03_06_2022_zad2;

import java.util.ArrayList;

public class PoreskaUprava {
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//            (ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//            (za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte

    protected String grad;
    protected ArrayList<Objekat> objekti = new ArrayList<>();

    public PoreskaUprava(String grad, ArrayList<Objekat> objekti) {
        this.grad = grad;
        this.objekti = objekti;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }

    public void setObjekti(ArrayList<Objekat> objekti) {
        this.objekti = objekti;
    }

    public void dodajObjekat(Objekat objekat) {
        objekti.add(objekat);
    }

    public void ukupanGradskiPorez() {
        double suma = 0;
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).porez();
            suma = suma + objekti.get(i).porez();


        }
    }


    public void stampajObjekte() {
        for (int i = 0; i < objekti.size(); i++) {
            System.out.println(objekti.get(i));

        }

    }

}
