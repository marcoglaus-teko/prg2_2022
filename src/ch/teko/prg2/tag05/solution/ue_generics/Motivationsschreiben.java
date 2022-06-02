package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Motivationsschreiben extends Dokument {
    private String name = "Motivationsschreiben";

    public Motivationsschreiben(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
