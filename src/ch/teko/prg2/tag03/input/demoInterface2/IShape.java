package ch.teko.prg2.tag03.input.demoInterface2;

import java.sql.Timestamp;
import java.util.Date;

public interface IShape {
    double calcArea();
    default void printSomehting() {
        System.out.println("This is a default-Method in an Interface!");
        System.out.printf("The current time is: %s", getTime());
    }

    //private Methode
    private String getTime(){
        Timestamp timestamp = new Timestamp(new Date().getTime());
        return timestamp.toString();
    }

    //statische Variable, final!
    public static final double var = 1.11;
}
