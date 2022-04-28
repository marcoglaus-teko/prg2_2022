package ch.teko.prg2.tag01.input.vererbung.subtyping;

public class Sparkonto extends Konto {
    private double maxOut;

    public Sparkonto(double saldo, double rate) {
        super(saldo, rate);
        this.maxOut = 10000.0;
        
    }

    @Override
    public void payIn(double value) {
        super.payIn(value);
    }

}
