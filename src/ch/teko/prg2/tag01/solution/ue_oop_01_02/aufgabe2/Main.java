package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe2;

public class Main {
    public static void main(String[] args) {
        // Pizzakarte
        System.out.println("Pizzakarte: ");
        Menue menue1 = new Pizza("Margherita", 18.5, new String[]{"Tomaten", "Mozzarella"});
        Menue menue2 = new Pizza("Funghi", 19.5, new String[]{"Tomaten", "Mozzarella", "Champignons"});
        Menue menue3 = new Pizza("Quattro Stagione", 22.5, new String[]{"Tomaten", "Mozzarella", "Champignons", "Schinken", "Artischocken"});
        Menue menue4 = new Pizza("Pizza Speziale", 12.5, new String[]{"Tomaten"});
        menue1.printMenue();
        menue2.printMenue();
        menue3.printMenue();
        menue4.printMenue();

        // Leerzeile
        System.out.println("");

        // Tageskarte
        System.out.println("Die heutige Tageskarte: ");
        Menue menue5 = new Pasta("Pasta alla carbonara", 14.5, "Carbonara");
        Menue menue6 = new Pasta("Pasta verdure", 22.5, "Gemuese Sugo");
        Menue menue7 = new Menue("Schnippo", 17.5);
        menue5.printMenue();
        menue6.printMenue();
        menue7.printMenue();
    }
}

