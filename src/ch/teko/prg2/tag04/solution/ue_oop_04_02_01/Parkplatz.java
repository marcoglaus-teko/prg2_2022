package ch.teko.prg2.tag04.solution.ue_oop_04_02_01;

public class Parkplatz {
    private Fahrzeug fahrzeug;

    public Parkplatz(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

}
