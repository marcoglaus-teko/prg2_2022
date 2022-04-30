package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe1;

/**
 * main-methode
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Hans Peter", 1234);
        Person p = new Person("Peter Meier");
        s.writeOutput();
    }
}
