package ch.teko.prg2.tag01.input.vererbung.subtyping;

public class Konto {
    private double saldo;
    private double rate;

    public Konto(double saldo, double rate) {
        this.saldo = saldo;
        this.rate = rate;
    }

    public void print() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void payIn(final double value){
        if (value > 0.0) {
            saldo += value;
        }
    }
}
