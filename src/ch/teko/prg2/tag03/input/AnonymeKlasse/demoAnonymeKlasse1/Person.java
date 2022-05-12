package ch.teko.prg2.tag03.input.AnonymeKlasse.demoAnonymeKlasse1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }
}
