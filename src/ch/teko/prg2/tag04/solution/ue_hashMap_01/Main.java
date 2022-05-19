package ch.teko.prg2.tag04.solution.ue_hashMap_01;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Verwaltung Studenten 1. Semester
        Semester semester1 = new Semester(1);
        semester1.addStudent(123, new Student("Meier", "Hans"));
        semester1.addStudent(124, new Student("Stocker", "Peter"));
        semester1.addStudent(125, new Student("Hüsler", "Philipp"));

        // Ausgabe
        Collection<Student> values = semester1.getStudentMap().values();
        for (Student s : values) {
            System.out.println(s.getVorname());
        }

        System.out.println("---\n");

        // Student mit Matrikelnr. 124 hat das Semester nicht bestanden ...
        semester1.removeStudent(124);

        // Ausgabe
        for (Student s : values) {
            System.out.println(s.getVorname());
        }

        System.out.println("---\n");

        // Student mit dem Namen "Hüsler" hat das Semester nicht bestanden ...
        semester1.removeStudent("Hüsler");

        // Ausgabe
        for (Student s : values) {
            System.out.println(s.getVorname());
        }
    }
}
