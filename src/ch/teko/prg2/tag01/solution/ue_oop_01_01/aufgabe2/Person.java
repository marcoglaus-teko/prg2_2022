package ch.teko.prg2.tag01.solution.ue_oop_01_01.aufgabe2;

/**
 * Oberklasse Person
 */
public class Person {
    private String nachname;
    private String vorname;
    private int alter;

    /**
     * @param nachname
     * @param vorname
     * @param alter
     */
    public Person(String nachname, String vorname, int alter) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
    }

    /**
     * Konstruktorenverkettung mit this(...)
     */
    public Person() {
        this("Peter", "Hans", 18);
    }

    /**
     * Methode
     */
    public void printInformation() {
        System.out.printf("%s, %s, %d", this.nachname, this.vorname, this.alter);
    }

}
