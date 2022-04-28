package ch.teko.prg2.tag01.input.vererbung.beispiel3;

public class Shape {
    public String color;

    public Shape() {
        this("Blue");
    }

    public Shape(String color) {
        this.color = color;
    }

    public void printSmth() {
        System.out.println(this.color);
    }
}
