package Vezbanje05062022;

public class RekreativniPlaninar extends Planinar {

//    (20 poena) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar.
//    Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//            ●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//            ●	naziv okruga odakle je rekreativni planinar.
//            ●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon
// manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme
// koji nosi može da pređe 50 metara manje.
//            ●	rekeativci placaju clanarinu u iznosu od 1000 rsd
//●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//    Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)

    private int tezinaOpremeKG;
    private String nazivOkruga;
    private int maxUsponUm;

    public RekreativniPlaninar(int idPlaninara, String imePlaninara, int tezinaOpremeKG, String nazivOkruga, int maxUsponUm) {
        super(idPlaninara, imePlaninara);
        this.tezinaOpremeKG = tezinaOpremeKG;
        this.nazivOkruga = nazivOkruga;
        this.maxUsponUm = maxUsponUm;
    }

    public int getTezinaOpremeKG() {
        return tezinaOpremeKG;
    }

    public void setTezinaOpremeKG(int tezinaOpremeKG) {
        this.tezinaOpremeKG = tezinaOpremeKG;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaxUsponUm() {
        return maxUsponUm;
    }

    public void setMaxUsponUm(int maxUsponUm) {
        this.maxUsponUm = maxUsponUm;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, ID: " + this.idPlaninara);
        System.out.println("Ime: " + this.imePlaninara);
        System.out.println("Okrug: " + nazivOkruga);
        System.out.println();

    }

    @Override
    public double clanarina() {
        return 1000.0;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return this.maxUsponUm >= planina.getVisinaPlanine() + 50 * this.tezinaOpremeKG;
    }
}
