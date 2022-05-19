package ch.teko.prg2.tag04.solution.ue_hashSet_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Semester {
    private int semester;

    private Set<Student> studentSet;

    public Semester(int semester) {
        this.semester = semester;
        this.studentSet = new HashSet<>();
    }

    public void addStudent(Student student) {
        this.studentSet.add(student);
    }

    public void removeStudent(int matrikelnr) {
        Iterator<Student> iterator = this.studentSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getMatrikelnr() == matrikelnr) {
                iterator.remove();
            }
        }
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }
}
