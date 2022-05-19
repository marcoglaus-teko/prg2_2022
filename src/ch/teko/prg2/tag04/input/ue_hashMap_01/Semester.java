package ch.teko.prg2.tag04.input.ue_hashMap_01;

import java.util.HashMap;
import java.util.Map;

public class Semester {
    private int semesterId;
    private Map<Integer, Student> studentMap;

    public Semester(int semesterId) {
        this.semesterId = semesterId;
        this.studentMap = new HashMap<>();
    }

    public int getSemesterId() {
        return semesterId;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void addStudent(Integer matrikelnr, Student student) {
        this.studentMap.put(matrikelnr, student);
    }

    public void removeStudent(Integer matrikelnr) {
        // Implementieren Sie!

    }

    public void removeStudent(String name) {
        // Implementieren Sie!
    }
}
