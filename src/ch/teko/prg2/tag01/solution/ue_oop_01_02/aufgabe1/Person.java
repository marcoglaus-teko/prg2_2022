package ch.teko.prg2.tag01.solution.ue_oop_01_02.aufgabe1;

/**
 * Oberklasse
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeOutput() {
        System.out.println("Name: " + this.getName());
    }
}

