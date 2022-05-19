package ch.teko.prg2.tag04.input.ue_generics_02;

public class Wein extends Getraenk {
    private String herkunft;

    public Wein(String herkunft) {
        this.herkunft = herkunft;
    }

    public String getHerkunft() {
        return herkunft;
    }
}
