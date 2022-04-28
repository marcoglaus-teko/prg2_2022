package ch.teko.prg2.tag01.input.reptition.demo2;

public class Etui {
    private String material;
    private String farbe;
    private double price;
    private Bleistift[] bleistifte;
    private Farbstift[] farbstifte;
    private Füller[] füller;
    private Kugelschreiber[] kugelschreiber;

    public Etui(String material, String farbe, double price, int anzahlBleistifte, int anzahlFarbstifte, int anzahlFüller, int anzahlKugelschreiber) {
        this.material = material;
        this.farbe = farbe;
        this.price = price;
        this.bleistifte = new Bleistift[anzahlBleistifte];
        this.farbstifte = new Farbstift[anzahlFarbstifte];
        this.füller = new Füller[anzahlFüller];
        this.kugelschreiber = new Kugelschreiber[anzahlKugelschreiber];
    }

    public Etui() {
        this("Leder", "Schwarz", 10.0, 2, 5, 1, 1);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bleistift[] getBleistifte() {
        return bleistifte;
    }

    public void setBleistifte(Bleistift[] bleistifte) {
        this.bleistifte = bleistifte;
    }

    public Farbstift[] getFarbstifte() {
        return farbstifte;
    }

    public void setFarbstifte(Farbstift[] farbstifte) {
        this.farbstifte = farbstifte;
    }

    public Füller[] getFüller() {
        return füller;
    }

    public void setFüller(Füller[] füller) {
        this.füller = füller;
    }

    public Kugelschreiber[] getKugelschreiber() {
        return kugelschreiber;
    }

    public void setKugelschreiber(Kugelschreiber[] kugelschreiber) {
        this.kugelschreiber = kugelschreiber;
    }
}
