package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Eheurkunde extends Dokument {
    private String name = "Eheurkunde";

    public Eheurkunde(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
