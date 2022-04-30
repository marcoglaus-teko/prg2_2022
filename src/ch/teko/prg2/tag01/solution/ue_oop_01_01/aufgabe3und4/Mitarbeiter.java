package ch.teko.prg2.tag01.solution.ue_oop_01_01.aufgabe3und4;

/**
 * Unterklasse von Person
 */
public class Mitarbeiter extends Person {
    private int mitarbeiterID;

    /**
     * @param name
     * @param vorname
     * @param alter
     * @param gehalt
     * @param ferien
     * @param mitarbeiterID
     */
    public Mitarbeiter(String name, String vorname, int alter, int gehalt, int ferien, int mitarbeiterID) {
        super(name, vorname, alter, gehalt, ferien);
        this.mitarbeiterID = mitarbeiterID;
    }

    /**
     * @return int
     */
    public int getMitarbeiterID() {
        return mitarbeiterID;
    }
}
