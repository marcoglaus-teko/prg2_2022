package ch.teko.prg2.tag05.solution.ue_hashSet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lehrperson that = (Lehrperson) o;

        return getLehrpersonID() == that.getLehrpersonID();
    }

    @Override
    public int hashCode() {
        return getLehrpersonID();
    }
}
