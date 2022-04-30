package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe2;

/**
 * Unterklasse
 */
public class Pizza extends Menue {
    private String[] belaege;

    public Pizza(String name, double preis, String[] belaege) {
        super(name, preis);
        this.belaege = belaege;
    }

    // Gibt die einzelnen Beleage als String zurück
    public String getBelaege() {
        String beleage = "";
        if (this.belaege.length == 1) {
            beleage = this.belaege[0];
        } else {
            for (int i = 0; i < this.belaege.length; i++) {
                // String "Kosmetik", damit die einzelnen Beleage mit einem Komma getrennt sind
                beleage = beleage + this.belaege[i] + ", ";
            }
            // letztes Komma entfernen
            beleage = beleage.substring(0, beleage.length() - 2);
        }
        return beleage;
    }

    @Override
    public void printMenue() {
        System.out.println("Eine " + this.getName() + " mit " + this.getBelaege() + " kostet " + this.getPreis() + ".-");
    }
}

