package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe1;

/**
 * Unterklasse
 */
public class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println("Student Number: " + this.getStudentNumber());
        super.writeOutput();
    }
}

