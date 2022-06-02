package ch.teko.prg2.tag05.solution.ue_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Klasse implements IKlasse {
    private String klassenname;
    private String semester;

    // Lehrpersonen Map
    private HashMap<Integer, Lehrperson> lehrpersonen = new HashMap<>();

    // Studenten Map
    private HashMap<Integer, Student> studenten = new HashMap<>();

    public Klasse(String klassenname, String semester) {
        this.klassenname = klassenname;
        this.semester = semester;
    }

    public String getKlassenname() {
        return klassenname;
    }

    public String getSemester() {
        return semester;
    }

    @Override
    public void add(Student s) {
        this.studenten.put(s.getStudentID(), s);
    }

    @Override
    public void add(Lehrperson l) {
        this.lehrpersonen.put(l.getLehrpersonID(), l);
    }

    @Override
    public Person get(int id) {
        Set<Integer> lehrpersonenKeySet = this.lehrpersonen.keySet();
        Set<Integer> studentenKeySet = this.studenten.keySet();

        Person p = null;

        for (Integer i : studentenKeySet) {
            if (i == id) {
                p = this.studenten.get(i);
            }
        }

        for (Integer i : lehrpersonenKeySet) {
            if (i == id) {
                p = this.lehrpersonen.get(i);
            }
        }

        return p;
    }

    @Override
    public Person get(String name, String vorname) {
        Set<Map.Entry<Integer, Lehrperson>> lehrpersonenEntrySet = this.lehrpersonen.entrySet();
        Set<Map.Entry<Integer, Student>> studentenEntrySet = this.studenten.entrySet();

        Person p = null;

        for (Map.Entry<Integer, Lehrperson> l: lehrpersonenEntrySet) {
            if (l.getValue().getName().equals(name) && l.getValue().getVorname().equals(vorname)) {
                p = l.getValue();
            }
        }

        for (Map.Entry<Integer, Student> s: studentenEntrySet) {
            if (s.getValue().getName().equals(name) && s.getValue().getVorname().equals(vorname)) {
                p = s.getValue();
            }
        }

        return p;
    }

    @Override
    public void remove(int id) {
        this.studenten.remove(id);
        this.lehrpersonen.remove(id);
    }

    @Override
    public void print() {
        System.out.printf("Die Klasse %s im Semester %s besteht aus folgenden Studenten und wird von nachfolgenden Lehrern unterrichtet: \n", this.getKlassenname(), this.getSemester());
        System.out.println("Studenten:");
        for (Map.Entry<Integer, Lehrperson> l: this.lehrpersonen.entrySet()) {
            System.out.printf("%d, %s \n",l.getKey(), l.getValue().toString());
        }

        System.out.println("Lehrpersonen:");
        for (Map.Entry<Integer, Student> s: this.studenten.entrySet()) {
            System.out.printf("%d, %s \n",s.getKey(), s.getValue().toString());
        }
        System.out.println("");
    }
}
