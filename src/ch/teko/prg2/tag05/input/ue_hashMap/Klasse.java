package ch.teko.prg2.tag05.input.ue_hashMap;

import java.util.HashMap;
import java.util.HashSet;

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
