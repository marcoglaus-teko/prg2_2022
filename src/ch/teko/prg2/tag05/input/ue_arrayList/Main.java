package ch.teko.prg2.tag05.input.ue_arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Morgendliche Planung der Linie 1 & 2
        Linienplanung linienplanung = new Linienplanung();
        linienplanung.addBus2Linie(new Bus(new Fahrer("Meier", "Peter"), 1122), 1);
        linienplanung.addBus2Linie(new Bus(new Fahrer("Heinzer", "Peter"), 1123), 1);
        linienplanung.addBus2Linie(new Bus(new Fahrer("Rüttimann", "Michael"), 2211), 2);
        linienplanung.addBus2Linie(new Bus(new Fahrer("August", "Heinz"), 2212), 2);

        // Ausgabe zur Überprüfung
        System.out.println(linienplanung.toString());

        // Passagiere steigen ein in den Bus mit ID 1122
        Bus bus = linienplanung.getBusWithIDFromAnyLine(1122);
        bus.einsteigen(new Passagier("Meier", "Peter"));
        bus.einsteigen(new Passagier("Suares", "Carlos"));
        bus.einsteigen(new Passagier("Ehrler", "Fritz"));

        // Ausgabe zur Überprüfung
        bus.printPassagiere();

        // Passagier "Suares" steigt aus
        bus.aussteigen("Suares");

        // Ausgabe zur Überprüfung
        bus.printPassagiere();

        // Endstation bitte alle aussteigen
        bus.aussteigen();

        // Ausgabe zur Überprüfung
        bus.printPassagiere();

        // Abendliche Planung der Linie 1 & 2
        // Zur Versärlung der Linie 2, wechselt Bus mit der ID 1122 zur Linie 2
        Bus tempBus = linienplanung.getBusWithIDFromAnyLine(1122);
        linienplanung.removeBusFromAnyLine(1122);
        linienplanung.addBus2Linie(tempBus, 2);

        // Ausgabe zur Überprüfung
        System.out.println(linienplanung.toString());
    }
}
