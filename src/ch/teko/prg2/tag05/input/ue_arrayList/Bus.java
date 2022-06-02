package ch.teko.prg2.tag05.input.ue_arrayList;

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
        // Implementieren Sie!
    }

    public void aussteigen(String name) {
        // Implementieren Sie!
    }

    public void aussteigen() {
        // Implementieren Sie!
    }

    public void printPassagiere() {
        for (Passagier p : this.reisende) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

}
