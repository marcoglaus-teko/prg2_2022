package ch.teko.prg2.tag04.input.ue_hashMap_01;

public class Student {
    private String name;
    private String vorname;

    public Student(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getVorname() != null ? getVorname().equals(student.getVorname()) : student.getVorname() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getVorname() != null ? getVorname().hashCode() : 0);
        return result;
    }
}
