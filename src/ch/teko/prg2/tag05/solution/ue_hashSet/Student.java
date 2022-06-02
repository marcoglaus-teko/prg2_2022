package ch.teko.prg2.tag05.solution.ue_hashSet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return getStudentID() == student.getStudentID();
    }

    @Override
    public int hashCode() {
        return getStudentID();
    }
}
