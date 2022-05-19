package ch.teko.prg2.tag04.input.ue_hashSet_01;

public class Student {
    private int matrikelnr;
    private String name;
    private String vorname;
    private int semester;

    public Student(int matrikelnr, String name, String vorname, int semester) {
        this.matrikelnr = matrikelnr;
        this.name = name;
        this.vorname = vorname;
        this.semester = semester;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getMatrikelnr() != student.getMatrikelnr()) return false;
        if (getSemester() != student.getSemester()) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getVorname() != null ? getVorname().equals(student.getVorname()) : student.getVorname() == null;
    }

    @Override
    public int hashCode() {
        int result = getMatrikelnr();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getVorname() != null ? getVorname().hashCode() : 0);
        result = 31 * result + getSemester();
        return result;
    }
}
