package ch.teko.prg2.tag01.input.vererbung.konstruktorenverkettung;

public class Auto {
    private String name;
    private int erstzulassung;
    private int leistung;

    // private oder public?
    private Auto(final String name) {
        this.name = name.toUpperCase();
    }

    public Auto(final String name, final int erstzulassung, final int leistung) {
        this(name);
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getErstzulassung() {
        return erstzulassung;
    }

    public void setErstzulassung(int erstzulassung) {
        this.erstzulassung = erstzulassung;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
}
