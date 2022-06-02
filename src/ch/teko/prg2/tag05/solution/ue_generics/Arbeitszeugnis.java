package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Arbeitszeugnis extends Dokument {
    private String name = "Arbeitszeugnis";

    public Arbeitszeugnis(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
