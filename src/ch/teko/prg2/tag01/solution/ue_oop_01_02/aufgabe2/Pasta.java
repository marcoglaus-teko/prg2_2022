package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe2;

/**
 * Unterklasse
 */
public class Pasta extends Menue {
    private String sosse;

    public Pasta(String name, double preis, String sosse) {
        super(name, preis);
        this.sosse = sosse;
    }

    public String getSosse() {
        return sosse;
    }

    @Override
    public void printMenue() {
        System.out.println("Eine " + this.getName() + " mit " + this.getSosse() + " kostet " + this.getPreis() + ".-");
    }
}
