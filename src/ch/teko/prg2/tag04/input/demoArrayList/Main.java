package ch.teko.prg2.tag04.input.demoArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // ArrayListe erstellen
        ArrayList<Student> classList = new ArrayList<>();

        // Elemente hinzufügen
        classList.add(new Student("Peter", "Hans", 4.9));
        classList.add(new Student("Meier", "Hans", 4.0));

        /*
         * Werte aus einer ArrayList ausgeben
         */

        // Variante foreach ("enhanced for")
        for (Student s : classList) {
            System.out.printf("%s %s, %f \n", s.getForename(), s.getSurname(), s.getGrade());
        }

        // Variante for-loop
        for (int i = 0; i < classList.size(); i++) {
            System.out.printf("%s %s, %f \n", classList.get(i).getForename(), classList.get(i).getSurname(), classList.get(i).getGrade());
        }

        // Variante Iterator
        Iterator<Student> iterator = classList.iterator();
        while (iterator.hasNext()) {
            // lokale variable s vom Typ Student
            Student s = iterator.next();
            System.out.printf("%s %s, %f \n", s.getForename(), s.getSurname(), s.getGrade());
        }

        // System out --> Achtung!
        System.out.println(classList);


        // Element aus der ArrayListe löschen
        while (iterator.hasNext()) {
            if (iterator.next().getSurname().equals("Meier")) {
                iterator.remove();
            }
        }

        for (Student s : classList) {
            System.out.printf("%s %s, %f \n", s.getForename(), s.getSurname(), s.getGrade());
        }

        // Liste leeren
        classList.clear();
        System.out.println(classList);

    }
}
