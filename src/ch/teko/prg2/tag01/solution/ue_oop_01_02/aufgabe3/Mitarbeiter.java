package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe3;

/**
 * Abstrakte Oberklasse
 */
public abstract class Mitarbeiter {
    private int persNr;
    private String name;
    private int dienstalter;

    /**
     * @param persNr
     * @param name
     * @param dienstalter
     */
    public Mitarbeiter(int persNr, String name, int dienstalter) {
        this.persNr = persNr;
        this.name = name;
        this.dienstalter = dienstalter;
    }

    public int getPersNr() {
        return persNr;
    }

    public String getName() {
        return name;
    }

    public int getDienstalter() {
        return dienstalter;
    }

    /**
     * Abstrakte Methode
     *
     * @return
     */
    public abstract double monatsBrutto();
}
