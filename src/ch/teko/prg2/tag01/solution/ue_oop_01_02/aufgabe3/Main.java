package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe3;

/**
 * main-Methode()
 */
public class Main {
    public static void main(String[] args) {
        // Objekt von Angestellter
        Mitarbeiter ma1 = new Angestellter(123, "Meier", 10, 4500, 500);
        System.out.println(ma1.monatsBrutto());

        // Objekt von Arbeiter
        Mitarbeiter ma2 = new Arbeiter(124, "Tobler", 2, 40, 42);
        System.out.println(ma2.monatsBrutto());
    }
}
