package d18_05_2022;

public class Proizvod {

//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

    public String naziv;
    public double cena;
    public double tezinaUGr;

    public void stampaj() {
        System.out.println("{{" + naziv + "}}" + " , " + "{{" + cena + "}}" + " , " + "{{" + tezinaUGr + "}}");
    }


}
