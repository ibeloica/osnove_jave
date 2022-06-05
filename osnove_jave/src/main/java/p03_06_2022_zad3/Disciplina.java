package p03_06_2022_zad3;

import java.util.ArrayList;

public class Disciplina {

    private String imeDiscipline;
    private String tipDiscipline;
    private ArrayList<Atleticar>trkaci = new ArrayList<>();
    private ArrayList<Atleticar>skakaci = new ArrayList<>();

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;

    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getTrkaci() {
        return trkaci;
    }

    public void setTrkaci(ArrayList<Atleticar> trkaci) {
        this.trkaci = trkaci;
    }

    public ArrayList<Atleticar> getSkakaci() {
        return skakaci;
    }

    public void setSkakaci(ArrayList<Atleticar> skakaci) {
        this.skakaci = skakaci;
    }

    public void dodajTrkaca(Atleticar atleticar){trkaci.add(atleticar);}
    public void dodajSkakaca(Atleticar atleticar){skakaci.add(atleticar);}


}
