package ch.teko.prg2.tag04.input.demoHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("Meier", "Hans"));
        studentHashSet.add(new Student("Peter", "Hans"));
        studentHashSet.add(new Student("Meier", "Hans"));

        for (Student s : studentHashSet) {
            System.out.println(s);
        }

        Iterator<Student> iterator = studentHashSet.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.printf("%s %s \n", s.getForename(), s.getSurname());
        }

    }
}
