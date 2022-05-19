package ch.teko.prg2.tag04.input.demoArrayList;

public class Student {
    private String surname;
    private String forename;
    private double grade;

    public Student(String surname, String forename, double grade) {
        this.surname = surname;
        this.forename = forename;
        this.grade = grade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
