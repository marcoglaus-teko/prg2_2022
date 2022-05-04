package ch.teko.prg2.tag02.solution.ue_oop_02_02;

public abstract class Ticket {
    private Ort eventOrt;
    private String eventName;
    private int basisPreis;
    private double ticketPreis;

    public Ticket(Ort eventOrt, String eventName, int basisPreis) {
        this.eventOrt = eventOrt;
        this.eventName = eventName;
        this.basisPreis = basisPreis;
    }

    public Ort getEventOrt() {
        return eventOrt;
    }

    public String getEventName() {
        return eventName;
    }

    public int getBasisPreis() {
        return basisPreis;
    }

    public double getTicketPreis() {
        return ticketPreis;
    }

    public void setTicketPreis(double ticketPreis) {
        this.ticketPreis = ticketPreis;
    }

    // abstrakte Methode
    public abstract double berechneTicketPreis();
}
