package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe3;

/**
 * Unterklasse
 */
public class Angestellter extends Mitarbeiter {
    private double grundGehalt;
    private double zulage;

    public Angestellter(int persNr, String name, int dienstalter, double grundGehalt, double zulage) {
        super(persNr, name, dienstalter);
        this.grundGehalt = grundGehalt;
        this.zulage = zulage;
    }

    /**
     * Überschreiben der abstrakten Methode der Oberklasse
     *
     * @return
     */
    @Override
    public double monatsBrutto() {
        return this.grundGehalt + this.zulage;
    }
}
