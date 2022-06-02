package ch.teko.prg2.tag05.solution.ue_hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Klasse implements IKlasse {
    private String klassenname;
    private String semester;
    // Lehrpersonenliste
    private HashSet<Lehrperson> lehrpersonen = new HashSet<>();

    // Studentenliste
    private HashSet<Student> studenten = new HashSet<>();

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
        this.studenten.add(s);
    }

    @Override
    public void add(Lehrperson l) {
        this.lehrpersonen.add(l);
    }

    @Override
    public Person get(int id) {
        Iterator<Lehrperson> itr1 = this.lehrpersonen.iterator();
        Iterator<Student> itr2 = this.studenten.iterator();

        Person p = null;

        while (itr1.hasNext()) {
            if (itr1.next().getLehrpersonID() == id) {
                p = itr1.next();
            }
        }

        while (itr2.hasNext()) {
            if (itr2.next().getStudentID() == id) {
                p = itr2.next();
            }
        }

        return p;
    }

    @Override
    public Person get(String name, String vorname) {
        Iterator<Lehrperson> itr1 = this.lehrpersonen.iterator();
        Iterator<Student> itr2 = this.studenten.iterator();

        Person p = null;

        while (itr1.hasNext()) {
            if ((itr1.next().getName().equals(name)) && itr1.next().getVorname().equals(vorname)) {
                p = itr1.next();
            }
        }

        while (itr2.hasNext()) {
            if ((itr2.next().getName().equals(name)) && itr2.next().getVorname().equals(vorname)) {
                p = itr2.next();
            }
        }

        return p;
    }

    @Override
    public void remove(int id) {
        Iterator<Lehrperson> itr1 = this.lehrpersonen.iterator();
        Iterator<Student> itr2 = this.studenten.iterator();

        while (itr1.hasNext()) {
            if (itr1.next().getLehrpersonID() == id) {
                itr1.remove();
            }
        }

        while (itr2.hasNext()) {
            if (itr2.next().getStudentID() == id) {
                itr2.remove();
            }
        }

    }

    @Override
    public void print() {
        System.out.printf("Die Klasse %s im Semester %s besteht aus folgenden Studenten und wird von nachfolgenden Lehrern unterrichtet: ", this.getKlassenname(), this.getSemester());
        System.out.println("Studenten:");
        for (Student s : this.studenten) {
            System.out.println(s.toString());
        }

        System.out.println("Lehrpersonen:");
        for (Lehrperson l : this.lehrpersonen) {
            System.out.println(l.toString());
        }
        System.out.println("");
    }
}
