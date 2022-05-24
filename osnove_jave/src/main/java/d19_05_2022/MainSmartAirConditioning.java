package d19_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        d19_05_2022.SmartAirConditioning klima1 = new SmartAirConditioning();
        d19_05_2022.SmartAirConditioning klima2 = new d19_05_2022.SmartAirConditioning();

        klima1.marka = "Samsung";
        klima1.izabranaTemp = 24;
        klima1.modRada = "greje";
        klima1.potrosnjaGrejanje = 3;
        klima1.potrosnjaHladjenje = 2;
        klima1.mesecnaPotrosnja();
        klima1.cenaKoriscenja();
        klima1.stampa();
        System.out.println("Mesecna potrosnja je: " + klima1.mesecnaPotrosnja());
        System.out.println("Mesecna cena koriscenja je: " + klima1.cenaKoriscenja());
    }
}
