package ch.teko.prg2.tag01.input.reptition.demo5;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Hans Muster", "Mercedes");
        Auto auto2 = new Auto("Hans Peter", "Audi");

        Parkplatz parkplatz = new Parkplatz(2, "Gemeindeparkplatz");
        parkplatz.parkiereAuto(1, auto1);
        parkplatz.parkiereAuto(0, auto2);

        // Konsolenausgabe von Besitzer und Marke der Autos
        // Variante for-loop
        System.out.println("----");
        for (int i = 0; i < parkplatz.getParkfelder().length; i++) {
            System.out.println(parkplatz.getParkfelder()[i].getBesitzer());
            System.out.println(parkplatz.getParkfelder()[i].getMarke());
        }

        // Variante foreach-loop
        System.out.println("----");
        for (Auto auto: parkplatz.getParkfelder()) {
            System.out.println(auto.getBesitzer());
            System.out.println(auto.getMarke());
        }
    }
}
