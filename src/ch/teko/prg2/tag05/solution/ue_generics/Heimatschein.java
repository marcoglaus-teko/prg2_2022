package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Heimatschein extends Dokument {
    private String name = "Heimatsschein";

    public Heimatschein(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
