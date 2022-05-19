package ch.teko.prg2.tag04.input.demoGeneric;

public class Tasche<T> {
    private T var;

    public Tasche(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
