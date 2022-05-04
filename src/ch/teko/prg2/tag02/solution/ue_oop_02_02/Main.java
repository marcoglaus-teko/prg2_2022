package ch.teko.prg2.tag02.solution.ue_oop_02_02;

public class Main {
    public static void main(String[] args) {
        // neues SportTicket
        Ticket sportTicket = new SportTicket(new Ort("Luzern"), "Pokalfinale", 50, 5);
        System.out.printf("%s Ticketpreis: %f.-", sportTicket.getEventName(), sportTicket.berechneTicketPreis());

        System.out.print("\n");

        // neues KonzertTicket
        Ticket konzertTicket = new KonzertTicket(new Ort("Luzern"), "Blue Balls Festival", 10, 1);
        System.out.printf("%s Ticketpreis: %f.-", konzertTicket.getEventName(), konzertTicket.berechneTicketPreis());
        System.out.print("\n");
        Ticket konzertTicket2 = new KonzertTicket(new Ort("Luzern"), "Blue Balls Festival", 10, 2);
        System.out.printf("%s Ticketpreis: %f.-", konzertTicket2.getEventName(), konzertTicket2.berechneTicketPreis());
        System.out.print("\n");
        Ticket konzertTicket3 = new KonzertTicket(new Ort("Luzern"), "Blue Balls Festival", 10, 10);
        System.out.printf("%s Ticketpreis: %f.-", konzertTicket3.getEventName(), konzertTicket3.berechneTicketPreis());

        System.out.print("\n");

        // neues KinoTicket
        Ticket kinoTicket = new KinoTicket(new Ort("Emmenbrücke"), "Maxx Filmpalast", 5, 300);
        System.out.printf("%s Ticketpreis: %f.-", kinoTicket.getEventName(), kinoTicket.berechneTicketPreis());
        System.out.print("\n");
        Ticket kinoTicket2 = new KinoTicket(new Ort("Emmenbrücke"), "Maxx Filmpalast", 5, 140);
        System.out.printf("%s Ticketpreis: %f.-", kinoTicket2.getEventName(), kinoTicket2.berechneTicketPreis());
    }
}
