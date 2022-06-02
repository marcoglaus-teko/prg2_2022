package ch.teko.prg2.tag05.input.ue_generics;

import java.time.LocalDate;

public class Betreibungsregisterauszug extends Dokument {
    private String name = "Betreibungsregisterauszug";

    public Betreibungsregisterauszug(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
