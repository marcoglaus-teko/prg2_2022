package ch.teko.prg2.tag05.input.ue_generics;


import java.time.LocalDate;

public class Dokument {
    private Aussteller aussteller;
    private LocalDate ausstellungsdatum;

    protected String name;

    public Dokument(Aussteller aussteller, LocalDate ausstellungsdatum) {
        this.aussteller = aussteller;
        this.ausstellungsdatum = ausstellungsdatum;
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "aussteller=" + aussteller +
                ", ausstellungsdatum=" + ausstellungsdatum +
                ", name='" + name + '\'' +
                '}';
    }
}
