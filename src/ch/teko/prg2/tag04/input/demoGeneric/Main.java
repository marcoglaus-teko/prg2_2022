package ch.teko.prg2.tag04.input.demoGeneric;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tasche<String> t1 = new Tasche<>("Dies ist ein Text");
        System.out.println(t1.getVar());

        Tasche<Integer> t2 = new Tasche<>(5);
        System.out.println(t2.getVar());

        Tasche<Maske> t3 = new Tasche<>(new Maske("ffp2"));
        System.out.println(t3.getVar().getTyp());

        // nicht nur auf einen Typ beschränkt... wie z.B. bei einer HashMap mit 2 Typen
        Koffer<Pass, Maske, Jacke, Hose, Medikament> koffer = new Koffer<>(new Pass(0123), new Maske("ffp2"), new Jacke("Hackett"), new Hose("Diesel"), new Medikament(new ArrayList<>()));
    }
}
