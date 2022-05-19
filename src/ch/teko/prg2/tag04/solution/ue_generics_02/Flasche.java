package ch.teko.prg2.tag04.solution.ue_generics_02;

public class Flasche<T> {
    private T inhalt;

    public Flasche() {
    }

    public void fuellen(T inhalt) {
        this.inhalt = inhalt;
    }

    public T leeren() {
        T result = this.inhalt;
        this.inhalt = null;
        return result;
    }
}
