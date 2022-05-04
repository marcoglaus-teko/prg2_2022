package ch.teko.prg2.tag02.solution.ue_oop_02_02;

public class KinoTicket extends Ticket {
    private int filmDauer;

    public KinoTicket(Ort eventOrt, String eventName, int basisPreis, int filmDauer) {
        super(eventOrt, eventName, basisPreis);
        this.filmDauer = filmDauer;
    }

    public int getFilmDauer() {
        return filmDauer;
    }

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis(this.getBasisPreis());

        if (this.getFilmDauer() > 150) {
            this.setTicketPreis(this.getTicketPreis() + 3);
        }
        return this.getTicketPreis();
    }
}
