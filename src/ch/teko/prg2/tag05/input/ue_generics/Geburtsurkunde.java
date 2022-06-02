package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Geburtsurkunde extends Dokument {
    private String name = "Geburtsurkunde";

    public Geburtsurkunde(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
