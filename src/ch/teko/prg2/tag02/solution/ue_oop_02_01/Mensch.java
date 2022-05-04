package ch.teko.prg2.tag02.solution.ue_oop_02_01;

public class Mensch {
    private String name;
    private String vorname;
    private int groesse;

    public Mensch(String name, String vorname, int groesse) {
        this.name = name;
        this.vorname = vorname;
        this.groesse = groesse;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getGroesse() {
        return groesse;
    }
}
