package ch.teko.prg2.tag01.input.vererbung.konstruktorenverkettung;

public class Shape {
    private String color;

    public Shape() {
        this("Blue");
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void printSmth() {
        System.out.println(this.color);
    }
}
