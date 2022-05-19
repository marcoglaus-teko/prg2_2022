package ch.teko.prg2.tag04.solution.ue_hashSet_01;

public class Main {
    public static void main(String[] args) {
        // Verwaltung Studenten 1. Semester
        Semester semester1 = new Semester(1);
        semester1.addStudent(new Student(123, "Meier", "Philipp", 1));
        semester1.addStudent(new Student(124, "Meier", "Hans", 1));
        semester1.addStudent(new Student(124, "Meier", "Hans", 1));
        semester1.addStudent(new Student(125, "Meier", "Peter", 1));

        // Ausgabe
        for (Student s : semester1.getStudentSet()) {
            System.out.printf("HashCode: %d + Name: %s + Vorname: %s%n", s.hashCode(), s.getName(), s.getVorname());
        }

        System.out.println("---\n");

        // Student mit Matrikelnr. 124 hat das Semester nicht bestanden ...
        semester1.removeStudent(124);

        for (Student s : semester1.getStudentSet()) {
            System.out.printf("HashCode: %d + Name: %s + Vorname: %s%n", s.hashCode(), s.getName(), s.getVorname());
        }
    }
}
