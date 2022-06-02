package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Bewerbung extends Dokument {
    private String name = "Bewerbung";

    public Bewerbung(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }


}
