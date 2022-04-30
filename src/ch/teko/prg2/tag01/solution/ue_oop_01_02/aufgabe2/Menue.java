package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe2;

/**
 * Oberklasse
 */
public class Menue {
    private String name;
    private double preis;

    public Menue(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void printMenue() {
        System.out.println("Ein(e) " + this.getName() + " kostet: " + this.getPreis() + ".-");
    }
}

