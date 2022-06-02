package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Wohnsitzbestätigung extends Dokument {
    private String name = "Wohnsitzbestätigung";

    public Wohnsitzbestätigung(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
