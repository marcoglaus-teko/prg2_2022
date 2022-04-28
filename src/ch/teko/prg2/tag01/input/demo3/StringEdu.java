package ch.teko.prg2.tag01.input.demo3;

public class StringEdu {
    public static void main(String[] args) {

        // ein paar Methoden von der Klasse String im Einsatz
        String a = "Hello String";
        System.out.println(a.toUpperCase());
        String b = " Hello String ";
        System.out.println(b);
        System.out.println(b.strip());

        // String mit new initialisiert
        String n = new String("Hello World!");
        System.out.println(n);

        // primitive Datentypen nach String konvertieren
        int i = 15;
        String s = String.valueOf(i);
        String t = i + "";

        // String nach primitiver Datentyp konvertieren
        String q = "1.15";
        double d = Double.parseDouble(q);
    }
}
