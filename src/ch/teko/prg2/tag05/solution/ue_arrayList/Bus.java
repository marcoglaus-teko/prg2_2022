package ch.teko.prg2.tag05.solution.ue_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Bus {
    private Fahrer chauffeur;
    private int internalBusID;
    private ArrayList<Passagier> reisende = new ArrayList<>();

    public Bus(Fahrer chauffeur, int internalBusID) {
        this.chauffeur = chauffeur;
        this.internalBusID = internalBusID;
    }

    public int getInternalBusID() {
        return internalBusID;
    }

    public void einsteigen(Passagier p) {
        this.reisende.add(p);
    }

    public void aussteigen(String name) {
        Iterator<Passagier> itr = this.reisende.iterator();

        while (itr.hasNext()) {
            if (itr.next().getName().equals(name)) {
                itr.remove();
            }
        }
    }

    public void aussteigen() {
        this.reisende.clear();
    }

    public void printPassagiere() {
        for (Passagier p : this.reisende) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

}
