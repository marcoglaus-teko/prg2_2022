package ch.teko.prg2.tag01.input.demo1;

public class Mensch {
    // Attribute
    private String name;
    private String vorname;
    private int alter;

    // Konstruktor(en)
    public Mensch(String name, String vorname, int alter) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
    }

    public Mensch(String name, String vorname) {
        this(name, vorname, 18);
    }

    // Methoden am Beispiel von Getter- & Setter-Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
