package ch.teko.prg2.tag04.solution.ue_oop_04_02_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Laden implements IService {

    private String name;
    private ArrayList<Abteilung> abteilungen;

    public Laden(String name, ArrayList<Abteilung> abteilungen) {
        this.name = name;
        this.abteilungen = abteilungen;
    }

    public ArrayList<Abteilung> getAbteilungen() {
        return abteilungen;
    }

    @Override
    public Artikel search(long ean) {
        Artikel result = null;
        Iterator<Abteilung> abteilungIterator = this.getAbteilungen().iterator();

        while (abteilungIterator.hasNext()) {
            Abteilung abteilung = abteilungIterator.next();
            Set<Long> keys = abteilung.getArikelListe().keySet();

            for (Long l : keys) {
                if (l.equals(ean)) result = abteilung.getArikelListe().get(l);
            }
        }
        return result;

    }

    @Override
    public void add(Artikel artikel, String abteilung) {

        Iterator<Abteilung> iterator = this.getAbteilungen().iterator();
        while (iterator.hasNext()) {
            Abteilung result = iterator.next();

            if (result.getName().equals(abteilung)) {
                result.getArikelListe().put(artikel.getEan(), artikel);
            }
        }
    }

}
