package Vezbanje05062022;

public class Planina {

    private String imePlanine;
    private String drzavaPlanine;
    private int visinaPlanine;

    public Planina(){}

    public Planina(String imePlanine, String drzavaPlanine, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.drzavaPlanine = drzavaPlanine;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getDrzavaPlanine() {
        return drzavaPlanine;
    }

    public void setDrzavaPlanine(String drzavaPlanine) {
        this.drzavaPlanine = drzavaPlanine;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

}
