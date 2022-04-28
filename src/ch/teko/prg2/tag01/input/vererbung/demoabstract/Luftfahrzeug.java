package ch.teko.prg2.tag01.input.vererbung.demoabstract;

public abstract class Luftfahrzeug extends Fahrzeug {
    private int altitude;

    public Luftfahrzeug(Position position, int altitude) {
        super(position);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
