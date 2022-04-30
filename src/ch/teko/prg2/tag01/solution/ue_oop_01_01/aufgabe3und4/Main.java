package ch.teko.prg2.tag01.solution.ue_oop_01_01.aufgabe3und4;

/**
 * Klasse, welche meine Main-Methode für den Start des Programms beinhält.
 */
public class Main {
    public static void main(String[] args) {
        Lehrling lehrling1 = new Lehrling("Meier", "Peter", 18, 500, 5, 123);
        System.out.println("Hallo " + lehrling1.getVorname() + " deine MitarbeiterID ist " + lehrling1.getMitarbeiterID());
    }
}
