package ch.teko.prg2.tag04.solution.ue_oop_04_02_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Fahrzeuge
        Fahrzeug fahrzeug1 = new Fahrzeug("Rot");
        Fahrzeug fahrzeug2 = new Fahrzeug("Gruen");
        Fahrzeug fahrzeug3 = new Fahrzeug("Blau");

        // Parkplaetze
        ArrayList<Parkplatz> parkplaetze = new ArrayList<>();

        parkplaetze.add(new Parkplatz(fahrzeug1));
        parkplaetze.add(new Parkplatz(fahrzeug2));
        parkplaetze.add(new Parkplatz(fahrzeug3));

        // Parkhaus
        Parkhaus kesselturm = new Parkhaus(parkplaetze);

        // Ausgabe
        Iterator<Parkplatz> parkplatzIterator = kesselturm.getParkplaetze().iterator();
        while (parkplatzIterator.hasNext()) {
            System.out.println(parkplatzIterator.next().getFahrzeug().getFarbe());
        }

        System.out.println("- -");
        for (Parkplatz p : kesselturm.getParkplaetze()) {
            System.out.println(p.getFahrzeug().getFarbe());
        }

    }

}
