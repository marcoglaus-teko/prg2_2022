package ch.teko.prg2.tag01.input.reptition.demo4.ifelse.compareDouble;

/**
 * Siehe dazu auch unter Artikel in der Dateiablage unter Manuals/Gleitkommazahlen.pdf
 */
public class Main {
    public static void main(String[] args) {

        // Kommazahlen können im Binär-System nicht auf die allerletzte Genauigkeit dargestellt werden
        // IEE754
        // Es entstehen Rundungsfehler
        double d1 = 33.25 * 100;
        System.out.println(d1);

        double d2 = 33.05 * 100;
        System.out.println(d2);

        double d3 = 0;
        for (int i = 1; i <= 8; i++) {
            d3 += 0.1;
        }

        double d4 = 0.1 * 8;
        System.out.println(d3);
        System.out.println(d4);


        // Genauigkeitsbereich/ Threshold
        double epsilon = 0.000001d;

        if (Math.abs(d3 - d4) < epsilon) {
            System.out.println("Values are the same!");
        }
    }
}
