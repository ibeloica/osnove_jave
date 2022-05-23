package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 24;
        klima1.modRada = "hladi";

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Gree";
        klima2.temperatura = 27;
        klima2.modRada = "greje";

        klima1.stampaj();
        System.out.println();
        klima2.stampaj();
    }
}
