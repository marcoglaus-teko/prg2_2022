package ch.teko.prg2.tag01.input.vererbung.subtyping;

public class Main {

    public static void main(String[] args) {
        Konto k = new Konto(1000.0, 0.05);
        Konto k1 = new Girokonto(10000.0, 0.0);
        Konto k2 = new Sparkonto(20000.0, 0.5);
        
        k.print();
        k1.print();
        k2.print();

    }
}
