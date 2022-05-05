package ch.teko.prg2.tag02.input.ue_oop_02_04;

public class Schulklasse implements IStatistik {
    private double[] noten;

    public Schulklasse(double[] noten) {
        this.noten = noten;
    }

    @Override
    public double median() {
        return 0;
    }

    @Override
    public double mittelwert() {
        return 0;
    }
}
