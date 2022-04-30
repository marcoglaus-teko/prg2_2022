package ch.teko.prg2.tag01.solution.ue_oop_01_01.aufgabe2;

/**
 * Unterklasse
 */
public class Angestellter extends Person {
    private int mitarbeiterID;

    /**
     * @param nachname
     * @param vorname
     * @param alter
     * @param mitarbeiterID
     */
    public Angestellter(String nachname, String vorname, int alter, int mitarbeiterID) {
        super(nachname, vorname, alter);
        this.mitarbeiterID = mitarbeiterID;
    }

    /**
     * überschriebene Methode
     */
    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println(this.mitarbeiterID);
    }
}
