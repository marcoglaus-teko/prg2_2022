package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Strafregisterauszug extends Dokument {
    private String name = "Strafregisterauszug";

    public Strafregisterauszug(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
