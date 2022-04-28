package ch.teko.prg2.tag01.input.reptition.demo4.ifelse.ticket;

public class Main {
    public static void main(String[] args) {
        Ticketautomat ticketautomat = new Ticketautomat(5);

        Person person1 = new Person(65);
        System.out.println("Age is: " + person1.getAlter() + " Ticketprice is: " + ticketautomat.calculatePrice(person1));

        Person person2 = new Person(35);
        System.out.printf("Age is: " + person2.getAlter() + " Ticketprice is: " + ticketautomat.calculatePrice(person2));
    }
}
