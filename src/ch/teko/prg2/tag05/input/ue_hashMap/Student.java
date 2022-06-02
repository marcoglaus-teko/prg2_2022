package ch.teko.prg2.tag05.input.ue_hashMap;

public class Student extends Person {
    private int studentID;

    public Student(String name, String vorname, int studentID) {
        super(name, vorname);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}' + super.toString();
    }
}
