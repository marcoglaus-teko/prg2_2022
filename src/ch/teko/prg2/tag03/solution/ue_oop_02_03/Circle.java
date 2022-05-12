package ch.teko.prg2.tag03.solution.ue_oop_02_03;

public class Circle implements IForms2D{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * this.getRadius();
    }
}
