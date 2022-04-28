package ch.teko.prg2.tag01.input.vererbung.konstruktorenverkettung;

public class Circle extends Shape {
    private String shapeName;

    public Circle() {
        this("Red");
    }

    public Circle(String color) {
        this(color, "Circle");
    }

    public Circle(String color, String name) {
        //super();
        this.shapeName = name;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }


    @Override
    public void printSmth() {
        System.out.println(super.getColor());
    }
}
