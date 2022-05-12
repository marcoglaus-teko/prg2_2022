package ch.teko.prg2.tag03.input.demoZuweisung;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

}
