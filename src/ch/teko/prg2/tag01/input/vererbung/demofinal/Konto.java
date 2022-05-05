package ch.teko.prg2.tag01.input.vererbung.demofinal;

public class Konto {
    private int kontostand;

    public Konto() {
    }

    public int getKontostand() {
        return kontostand;
    }

    /**
     * parameter ist finalisiert, somit kann auf amount kein neuer Wert innerhalb des Methodenscopes zugewiesen werden
     * @param amount
     */
    public void einzahlung(final int amount) {
        // amount = amount -1;
        this.kontostand += amount;
    }
}
