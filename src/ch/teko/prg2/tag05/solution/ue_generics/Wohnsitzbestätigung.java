package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Wohnsitzbest├Ątigung extends Dokument {
    private String name = "Wohnsitzbest├Ątigung";

    public Wohnsitzbest├Ątigung(Aussteller aussteller, LocalDate ausstellungsdatum) {
        super(aussteller, ausstellungsdatum);
        super.name = this.name;
    }

}
