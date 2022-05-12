package ch.teko.prg2.tag03.input.demoZuweisung2;

public class Main {
    public static void main(String[] args) {
        // geht auch mit einem Interface
        IPolygon iPolygon = new Circle(2.0);
        System.out.println(iPolygon.calculateArea());

        // Von Abstrakten Klassen und Interface kann ich keine Objekte mit new erstellen.
        // IPolygon iPolygon1 = new IPolygon();

        // Keine Regel ohne Ausnahme bei Java. Mit Anonymen Klassen geht es trotzdem!
        IPolygon iPolygon2 = new IPolygon() {
            @Override
            public double calculateArea() {
                return Math.PI*3.0*3.0;
            }
        };

        System.out.println(iPolygon2.calculateArea());
    }
}
