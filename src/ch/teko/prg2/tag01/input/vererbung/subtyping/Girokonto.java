package ch.teko.prg2.tag01.input.vererbung.subtyping;

public class Girokonto extends Konto {
    private double creditLimit;
    private double creditRate;

    public Girokonto(double saldo, double rate) {
        super(saldo, rate);
        this.creditLimit = -1000.0;
        this.creditRate = 10.0;
    }

    @Override
    public void print() {
        System.out.println("Kreditlimite: " + this.creditLimit);
        super.print();
    }

    @Override
    public void payIn(double value) {
        super.payIn(value);
    }

}
