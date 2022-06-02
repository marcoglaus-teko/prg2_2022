package ch.teko.prg2.tag05.input.ue_hashSet;

import java.util.HashSet;

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
        // Implementieren Sie!

    }

    @Override
    public void add(Lehrperson l) {
        // Implementieren Sie!

    }

    @Override
    public Person get(int id) {
        // Implementieren Sie!

        return null;
    }

    @Override
    public Person get(String name, String vorname) {
        // Implementieren Sie!

        return null;
    }

    @Override
    public void remove(int id) {
        // Implementieren Sie!

    }

    @Override
    public void print() {
        // Implementieren Sie!

    }
}
