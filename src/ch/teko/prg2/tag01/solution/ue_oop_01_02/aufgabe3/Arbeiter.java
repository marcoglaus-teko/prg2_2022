package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe3;

/**
 * Unterklasse
 */
public class Arbeiter extends Mitarbeiter {
    private double stundenLohn;
    private double anzahlStunden;

    public Arbeiter(int persNr, String name, int dienstalter, double stundenLohn, double anzahlStunden) {
        super(persNr, name, dienstalter);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
    }

    /**
     * Überschreiben der abstrakten Methode der Oberklasse
     *
     * @return
     */
    @Override
    public double monatsBrutto() {
        return this.stundenLohn * this.anzahlStunden;
    }
}
