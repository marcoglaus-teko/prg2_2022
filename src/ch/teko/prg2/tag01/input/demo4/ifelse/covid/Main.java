package ch.teko.prg2.tag01.input.demo4.ifelse.covid;

public class Main {
    public static void main(String[] args) {
        // Personen möchten ins Resaturant
        Person p1 = new Person("Meier", false, false);
        Person p2 = new Person("Heinz", false, true);

        // Massnahmenkontrolle am Eingang
        Coronamassnahmen c = new Coronamassnahmen();
        System.out.println("Darf eintreten: " + c.ueberpruefestatus(p1));
        System.out.println("Darf eintreten: " + c.ueberpruefestatus(p2));
    }
}
