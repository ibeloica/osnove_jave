package d18_05_2022;

public class SmartAirConditioning {

//    Kreirati klasu SmartAirConditioning koja ima:
//    atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//    atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//    atribut za mod (hladi/greje)
//    metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//    U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
//    i za svaki od njih pozvati metodu za stampu

    public String marka;
    public int temperatura;
    public String modRada;

    public void stampaj(){
        System.out.println("Marka klime: " + marka);
        System.out.println("Zeljena temperatura je: " + temperatura);
        System.out.println("Trenutni operativni mod je: " + modRada);
    }




}
