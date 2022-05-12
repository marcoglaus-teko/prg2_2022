package ch.teko.prg2.tag03.input.demoZuweisung;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double s;
    private String color;

    public Triangle(double a, double b, double c) {
        super("Triangle1");
        this.color = "Orange";
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt((this.s * (this.s - this.a) * (this.s - this.b) * (this.s - this.c)));
    }

    public String getColor() {
        return color;
    }
}
