package ch.teko.prg2.tag05.solution.ue_generics;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Bewerbungsformular
        Formular<Bewerbung, Motivationsschreiben> bewerbung = new Formular<>(new Bewerbung(new Aussteller("Glaus", "Marco"), LocalDate.now()), new Motivationsschreiben(new Aussteller("Glaus", "Marco"), LocalDate.now()));
        bewerbung.fügeZusatzdokumentHinzu(new Arbeitszeugnis(new Aussteller("Müller", "Heinz"), LocalDate.of(2021, 1, 1)));
        bewerbung.fügeZusatzdokumentHinzu(new Strafregisterauszug(new Aussteller("Müller", "Klara"), LocalDate.now()));

        bewerbung.printAnmeldeformular();

        // Kreditwürdigkeit
        Formular<Strafregisterauszug, Betreibungsregisterauszug> kreditantrag = new Formular<>(new Strafregisterauszug(new Aussteller("Meier", "Hans"), LocalDate.now()), new Betreibungsregisterauszug(new Aussteller("Müller", "Hans"), LocalDate.now()));
        kreditantrag.fügeZusatzdokumentHinzu(new Heimatschein(new Aussteller("Müller", "Klara"), LocalDate.now()));

        bewerbung.printAnmeldeformular();
    }
}
