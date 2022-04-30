package ch.teko.prg2.tag01.solution.ue_oop_01_01.aufgabe3und4;

/**
 * Unterklasse von Person
 */
public class Manager extends Person {
    private int managerID;

    /**
     * @param name
     * @param vorname
     * @param alter
     * @param gehalt
     * @param ferien
     * @param managerID
     */
    public Manager(String name, String vorname, int alter, int gehalt, int ferien, int managerID) {
        super(name, vorname, alter, gehalt, ferien);
        this.managerID = managerID;
    }

    /**
     * @return int
     */
    public int getManagerID() {
        return managerID;
    }
}
