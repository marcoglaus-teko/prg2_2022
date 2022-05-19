package ch.teko.prg2.tag04.solution.ue_generics_02;

public class Main {
    public static void main(String[] args) {
        // in generischer Implementierung soll
        // f1 nur für Bier dienen
        Flasche<Bier> f1 = new Flasche<>();
        f1.fuellen(new Bier("DHBW-Bräu"));
        System.out.println("f1 geleert mit " + f1.leeren());
        f1 = new Flasche<>();
        f1.fuellen(new Bier("DHBW-Export"));
        System.out.println("f1 geleert mit " + f1.leeren());

        // In der generischen Implementierung soll f2 nur für
        // Weinflaschen dienen
        Flasche<Wein> f2 = new Flasche<>();
        f2.fuellen(new Wein("Pfalz"));
        System.out.println("f2 geleert mit " + f2.leeren());

        f2 = new Flasche<>();
        f2.fuellen(new Wein("Bordeaux"));
        System.out.println("f2 geleert mit " + f2.leeren());
    }
}
