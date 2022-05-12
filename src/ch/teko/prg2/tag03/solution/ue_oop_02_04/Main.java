package ch.teko.prg2.tag03.solution.ue_oop_02_04;

public class Main {
    public static void main(String[] args) {
        Schulklasse schulklasse = new Schulklasse(new double[]{2.0,3.0,5.0,5.5,6.0});
        System.out.println(schulklasse.median());
        System.out.println(schulklasse.mittelwert());

        Schulklasse schulklasse1 = new Schulklasse(new double[]{3.0,5.0,5.5,6.0});
        System.out.println(schulklasse1.median());
        System.out.println(schulklasse1.mittelwert());

        Schulklasse schulklasse2 = new Schulklasse(new double[]{1.0,4.0,4.5,5.5,5.5,6.0,6.0});
        System.out.println(schulklasse2.median());
        System.out.println(schulklasse2.mittelwert());
    }
}
