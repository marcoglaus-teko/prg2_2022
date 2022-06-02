package ch.teko.prg2.tag05.solution.ue_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Linienplanung {
   private ArrayList<Bus> linie1 = new ArrayList<>();
   private ArrayList<Bus> linie2 = new ArrayList<>();

    public void addBus2Linie(Bus b, int i) {
       if (i == 1) {
           this.linie1.add(b);
       }
       else if (i == 2) {
           this.linie2.add(b);
       }
   }

   public Bus getBusWithIDFromAnyLine(int internalBusID) {
       Iterator<Bus> itr1 = this.linie1.iterator();
       Iterator<Bus> itr2 = this.linie2.iterator();

       Bus bus = null;

       while (itr1.hasNext()) {
           if (itr1.next().getInternalBusID() == internalBusID){
               bus = itr1.next();
           }
       }

       while (itr2.hasNext()) {
           if (itr2.next().getInternalBusID() == internalBusID) {
               bus = itr2.next();
           }
       }
       return bus;
   }


   public void removeBusFromAnyLine(int internalBusID) {
       Iterator<Bus> itr1 = this.linie1.iterator();
       Iterator<Bus> itr2 = this.linie2.iterator();

       while (itr1.hasNext()) {
           if (itr1.next().getInternalBusID() == internalBusID){
               itr1.remove();
           }
       }

       while (itr2.hasNext()) {
           if (itr2.next().getInternalBusID() == internalBusID) {
               itr2.remove();
           }
       }
   }

    @Override
    public String toString() {
        return "Linienplanung{" +
                "linie1=" + linie1 +
                ", linie2=" + linie2 +
                '}';
    }
}
