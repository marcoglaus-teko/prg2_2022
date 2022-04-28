package ch.teko.prg2.tag01.input.demo1;

public class Main {
    public static void main(String[] args) {
        // Objekt erstellen
        Mensch mensch1 = new Mensch("Glaus", "Marco", 28);
        System.out.printf("%s, %s, %d", mensch1.getVorname(), mensch1.getName(), mensch1.getAlter());

        System.out.println("\n");

        // zweites Obejekt der selben Klasse erstellen
        Mensch mensch2 = new Mensch("Meier", "Hans");
        System.out.println(mensch2.getVorname()+ ", " + mensch2.getName() + ", " + mensch2.getAlter());
    }
}
