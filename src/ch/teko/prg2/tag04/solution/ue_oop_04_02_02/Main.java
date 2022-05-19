package ch.teko.prg2.tag04.solution.ue_oop_04_02_02;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Abteilung> abteilungen = new ArrayList<>();
        HashMap<Long, Artikel> lebensmittelListe = new HashMap<>();
        HashMap<Long, Artikel> elektrogeraeteListe = new HashMap<>();
        abteilungen.add(new Abteilung("Lebensmittel", lebensmittelListe));
        abteilungen.add(new Abteilung("Elektrogeraete", elektrogeraeteListe));

        // Tante Emma Laden Luzern.
        // Dem Konstruktor wird die ArrayList abteilungen, die Objekte des Typs Abteilungen, haelt übergeben.
        Laden tanteEmmaLaden = new Laden("Tante Emma Laden Luzern", abteilungen);

        // Artikel hinzufuegen
        tanteEmmaLaden.add(new Artikel(1134567898761L, "Zucker"), "Lebensmittel");
        tanteEmmaLaden.add(new Artikel(1134567898762L, "Mais"), "Lebensmittel");
        tanteEmmaLaden.add(new Artikel(1134567898763L, "Hefe"), "Lebensmittel");
        tanteEmmaLaden.add(new Artikel(2234567898761L, "Playstation"), "Elektrogeraete");
        tanteEmmaLaden.add(new Artikel(2234567898762L, "Radio"), "Elektrogeraete");
        tanteEmmaLaden.add(new Artikel(2234567898763L, "Fernseher"), "Elektrogeraete");

        // Artikel suchen
        System.out.println(tanteEmmaLaden.search(1134567898763L).getName());
        System.out.println(tanteEmmaLaden.search(2234567898762L).getName());
    }
}
