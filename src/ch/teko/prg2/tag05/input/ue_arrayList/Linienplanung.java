package ch.teko.prg2.tag05.input.ue_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Linienplanung {
   private ArrayList<Bus> linie1 = new ArrayList<>();
   private ArrayList<Bus> linie2 = new ArrayList<>();

    public void addBus2Linie(Bus b, int i) {
       // Implementieren Sie!

   }

   public Bus getBusWithIDFromAnyLine(int internalBusID) {
       // Implementieren Sie!

       return null;
   }


   public void removeBusFromAnyLine(int internalBusID) {
       // Implementieren Sie!

   }

    @Override
    public String toString() {
        return "Linienplanung{" +
                "linie1=" + linie1 +
                ", linie2=" + linie2 +
                '}';
    }
}
