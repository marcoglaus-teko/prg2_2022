package ch.teko.prg2.tag04.input.ue_generics_01;

public class Tier {
    private String name;
    private String besitzer;

    public Tier(String name, String besitzer) {
        this.name = name;
        this.besitzer = besitzer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }
}
