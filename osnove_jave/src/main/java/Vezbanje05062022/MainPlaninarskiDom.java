package Vezbanje05062022;

public class MainPlaninarskiDom {
    public static void main(String[] args) {

        PlaninarskiDom pd = new PlaninarskiDom("Golema Reka", 1983);

        Planina p1 = new Planina("Kurojama", "srbija", 1800);
        p1.setDrzavaPlanine("Japan");
        Planina p2 = new Planina("Borovec", "bugarska", 5400);

        Alpinista a1 = new Alpinista(888, "Zika Babic", 15);
        Alpinista a2 = new Alpinista(777, "Momcilo Bajagic", 10);
        Alpinista a3 = new Alpinista(666, "Cane Kostic", 5);
        pd.uclaniPlaninara(a1);
        pd.uclaniPlaninara(a2);
        pd.uclaniPlaninara(a3);

        RekreativniPlaninar rp1 = new RekreativniPlaninar(999, "Maja Peric",
                10, "jablanicki", 2300);
        pd.uclaniPlaninara(rp1);

        pd.uclaniPlaninara(new RekreativniPlaninar(555, "Pera Majic",
                20, "bugarski", 3200));
        pd.uclaniPlaninara(new RekreativniPlaninar(333, "Lapo Ketic",
                15, "makedonski", 1600));

        a1.setPoeni(2);
        a2.stampaj();
        System.out.println();
        System.out.println(rp1.uspesanUspon(p1));

        pd.izbaciPlaninara(333);
        pd.stampaj();

        System.out.println("Mesecni prihod je " + pd.mesecniPrihod());


    }
}



