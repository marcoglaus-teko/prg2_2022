package ch.teko.prg2.tag05.solution.ue_hashSet;

public class Person {
    protected String name;
    protected String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }

}
