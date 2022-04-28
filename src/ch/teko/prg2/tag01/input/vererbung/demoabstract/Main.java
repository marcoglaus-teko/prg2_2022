package ch.teko.prg2.tag01.input.vererbung.demoabstract;

public class Main {
    public static void main(String[] args) {
        Cesna cesna = new Cesna(new Position(10,11), 2000, 800);
        cesna.movePosition();
    }
}
