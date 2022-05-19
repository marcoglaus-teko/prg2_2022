package ch.teko.prg2.tag04.solution.ue_hashMap_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        this.studentMap.remove(matrikelnr);
    }

    public void removeStudent(String name) {
        Set<Map.Entry<Integer, Student>> entrySet = this.studentMap.entrySet();
        for (Map.Entry<Integer, Student> e : entrySet) {
            if (e.getValue().getName().equals(name)) {
                this.removeStudent(e.getKey());
            }
        }
    }
}
