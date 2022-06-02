package ch.teko.prg2.tag05.solution.ue_generics;

public class Aussteller {
    private String name;
    private String vorname;

    public Aussteller(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Aussteller{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}
