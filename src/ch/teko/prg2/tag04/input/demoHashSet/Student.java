package ch.teko.prg2.tag04.input.demoHashSet;

public class Student {
    private String surname;
    private String forename;

    public Student(String surname, String forename) {
        this.surname = surname;
        this.forename = forename;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getSurname() != null ? !getSurname().equals(student.getSurname()) : student.getSurname() != null)
            return false;
        return getForename() != null ? getForename().equals(student.getForename()) : student.getForename() == null;
    }

    @Override
    public int hashCode() {
        int result = getSurname() != null ? getSurname().hashCode() : 0;
        result = 31 * result + (getForename() != null ? getForename().hashCode() : 0);
        return result;
    }
}
