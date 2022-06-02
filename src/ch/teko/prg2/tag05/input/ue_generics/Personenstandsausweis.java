package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Personenstandsausweis extends Dokument {
    private String name = "Personenstandsausweis";

    public Personenstandsausweis(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
