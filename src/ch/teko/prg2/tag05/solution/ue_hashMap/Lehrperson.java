package ch.teko.prg2.tag05.solution.ue_hashMap;

public class Lehrperson extends Person {
    private int lehrpersonID;

    public Lehrperson(String name, String vorname, int lehrpersonID) {
        super(name, vorname);
        this.lehrpersonID = lehrpersonID;
    }

    public int getLehrpersonID() {
        return lehrpersonID;
    }

    @Override
    public String toString() {
        return "Lehrperson{" +
                "lehrpersonID=" + lehrpersonID +
                '}' + super.toString();
    }
}
