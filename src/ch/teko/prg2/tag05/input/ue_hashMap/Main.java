package ch.teko.prg2.tag05.input.ue_hashMap;


public class Main {
    public static void main(String[] args) {
        // Klasse wird vom Sekretariat erstellt
        Klasse ltis20 = new Klasse("L-TIS-20-Do-a", "Sommersemester2022");

        // Lehrpersonen werden hinzugefügt
        ltis20.add(new Lehrperson("Glaus", "Marco", 79));
        ltis20.add(new Lehrperson("Glaus", "Marco", 79));
        ltis20.add(new Lehrperson("Hammer", "Bruno", 24));
        ltis20.add(new Lehrperson("Mai", "Karl", 23));

        // Studenten werden hinzugefügt
        ltis20.add(new Student("Meier", "Peter", 245));
        ltis20.add(new Student("Meier", "Hans", 246));
        ltis20.add(new Student("Tobler", "Hugo", 247));
        ltis20.add(new Student("Studhalter", "Michael", 248));
        ltis20.add(new Student("Schneider", "Vreni", 249));
        ltis20.add(new Student("Schneider", "Vreni", 249));

        // Ausgabe zur Überprüfung
        ltis20.print();

        // Student verlässt Klassen unter dem Semester, Lehrer auch.
        ltis20.remove(23);
        ltis20.remove(247);

        // Ausgabe zur Überprüfung
        ltis20.print();

        // Person heiratet und wechselt Namen
        Person s = ltis20.get(245);
        s.setName("Heinzer");

        // Ausgabe zur Überprüfung
        ltis20.print();
    }
}
